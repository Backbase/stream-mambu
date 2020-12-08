package com.backbase.stream.mambu.configuration;

import com.backbase.dbs.transaction.presentation.service.model.TransactionIds;
import com.backbase.mambu.clients.model.Client;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;
import com.backbase.mambu.loan.products.api.LoanProductsApi;
import com.backbase.stream.LegalEntitySaga;
import com.backbase.stream.LegalEntityTask;
import com.backbase.stream.TransactionService;
import com.backbase.stream.configuration.LegalEntitySagaConfiguration;
import com.backbase.stream.configuration.TransactionServiceConfiguration;
import com.backbase.stream.legalentity.model.CurrentAccount;
import com.backbase.stream.legalentity.model.EmailAddress;
import com.backbase.stream.legalentity.model.IdentityUserLinkStrategy;
import com.backbase.stream.legalentity.model.JobProfileUser;
import com.backbase.stream.legalentity.model.LegalEntity;
import com.backbase.stream.legalentity.model.LegalEntityType;
import com.backbase.stream.legalentity.model.Loan;
import com.backbase.stream.legalentity.model.PhoneNumber;
import com.backbase.stream.legalentity.model.ProductGroup;
import com.backbase.stream.legalentity.model.User;
import com.backbase.stream.mambu.mapper.ProductMapper;
import com.backbase.stream.mambu.service.ClientsService;
import com.backbase.stream.mambu.service.DepositAccountsService;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import com.backbase.stream.mambu.service.LoanService;
import com.backbase.stream.product.utils.StreamUtils;
import com.backbase.stream.productcatalog.ReactiveProductCatalogService;
import com.backbase.stream.productcatalog.configuration.ProductCatalogServiceConfiguration;
import com.backbase.stream.productcatalog.model.ProductCatalog;
import com.backbase.stream.productcatalog.model.ProductKind;
import com.backbase.stream.productcatalog.model.ProductType;
import com.backbase.stream.worker.exception.StreamTaskException;
import com.backbase.stream.worker.model.StreamTask;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

@Configuration
@Slf4j
@EnableConfigurationProperties({MambuBootstrapTaskConfiguration.class})
@Import({
    MambuConfiguration.class,
    LegalEntitySagaConfiguration.class,
    ProductCatalogServiceConfiguration.class,
    TransactionServiceConfiguration.class
})
@RequiredArgsConstructor
@ComponentScan("com.backbase.stream.mambu")
public class MambuBootstrapConfiguration {

    private final LegalEntitySaga legalEntitySaga;
    private final MambuConfigurationProperties mambuConfigurationProperties;
    private final MambuBootstrapTaskConfiguration mambuBootstrapTaskConfiguration;
    private final ClientsService clientsService;
    private final DepositAccountsService depositAccountsService;
    private final DepositTransactionsService depositTransactionsService;
    private final TransactionService transactionService;
    private final LoanService loanService;
    private final ProductMapper productMapper;
    private final ReactiveProductCatalogService productCatalogService;
    private final DepositProductsApi depositProductsApi;
    private final LoanProductsApi loanProductsApi;
    private final Scheduler single = Schedulers.single();
    private List<Pattern> nameFilterPatterns;

    public void execute() {
        if (mambuBootstrapTaskConfiguration.isSetupProductCatalog()) {
            productCatalogService.setupProductCatalog(mambuBootstrapTaskConfiguration.getProductCatalog()).block();
        }
        if (mambuBootstrapTaskConfiguration.isSetupLegalEntityHierachy()) {
            setupLegalEntityHierarchy();
        }
        Flux<LegalEntity> clients = createMambuLegalEntities();
        // Get Product Catalog and set it as context
        ProductCatalog productCatalog = getProductCatalog();
        // Get All Mambu Customers
        List<LegalEntity> legalEntityAggregates = setupProductCatalogForMambuCustomers(clients, productCatalog);

        if (mambuBootstrapTaskConfiguration.isIngestProductCatalog()) {
            setupProductCatalog(productCatalog);
        }

        if (mambuBootstrapTaskConfiguration.isIngestMambuClients()) {
            ingestMambuClients(legalEntityAggregates);
        }

        if (mambuBootstrapTaskConfiguration.isIngestMambuTransactions()) {
            ingestMambuTransactions(legalEntityAggregates);
        }

        if(mambuBootstrapTaskConfiguration.isIngestMambuClientsAsBeneficiaries()) {
            ingestMambuCLientsAsBeneficiaries(legalEntityAggregates);
        }


    }

    private void ingestMambuCLientsAsBeneficiaries(List<LegalEntity> legalEntityAggregates) {

        legalEntityAggregates.forEach(legalEntity ->  {

            List<LegalEntity> otherClients = legalEntityAggregates.stream().filter(le -> !le.equals(legalEntity)).collect(Collectors.toList());


        });

    }

    private void setupProductCatalog(ProductCatalog productCatalog) {
        log.info("Setting up Product Catalog");
        Flux.fromStream(productCatalog.getProductTypes().stream().filter(productType -> productType.getExternalId() == null))
            .flatMap(productType -> productCatalogService.createProductType(productType, productCatalog.getProductKinds()))
            .doOnNext(productType -> log.info("Created Product Type: {}", productType.getTypeName()))
            .collectList()
            .block();
    }

    private List<LegalEntity> setupProductCatalogForMambuCustomers(Flux<LegalEntity> clients, ProductCatalog productCatalog) {
        return clients
            .flatMap(legalEntity -> setupMambuProducts(legalEntity, productCatalog))
            .collectList()
            .block();
    }

    private void ingestMambuTransactions(List<LegalEntity> legalEntityAggregates) {
        List<Tuple2<LegalEntity, List<TransactionIds>>> block = Flux.fromIterable(legalEntityAggregates)
            .flatMap(this::ingestTransactions)
            .doOnNext(legalEntityWithTransactions -> log.info("Ingested {} transactions for: {}", legalEntityWithTransactions.getT2().size(), legalEntityWithTransactions.getT1().getName()))
            .collectList()
            .doOnNext(list -> log.info("Finished transaction of {} legal entities", list.size()))
            .block();

        assert block != null;

        long count = block.stream().mapToLong(objects -> objects.getT2().size()).sum();
        log.info("Ingested  {} transactions", count);
    }

    private void ingestMambuClients(List<LegalEntity> legalEntityAggregates) {
        log.info("Start Ingestion of All Mambu Clients");
        Flux.fromIterable(legalEntityAggregates)
            .publishOn(Schedulers.single())
            .map(LegalEntityTask::new)
            .filter(legalEntityTask -> {
                boolean b = !legalEntityTask.getLegalEntity().getProductGroups().isEmpty() &&
                    legalEntityTask.getLegalEntity().getProductGroups().stream().noneMatch(productGroup -> StreamUtils.getAllProducts(productGroup).isEmpty());
                if (!b) {
                    log.warn("Legal Entity: {} does not have any products", legalEntityTask.getLegalEntity().getName());
                }
                return b;
            })
            .flatMap(legalEntitySaga::executeTask)
            .onErrorResume(StreamTaskException.class, e -> {
                StreamTask streamTask = e.getTask();
                log.error("Failed to ingest Mambu Client: {}", streamTask.getId());
                e.getTask().logSummary();
                return Mono.empty();
            })
            .doOnNext(StreamTask::logSummary)
            .collectList()
            .doOnNext(list -> log.info("Finished ingestion of {} legal entities", list.size()))
            .block();
    }

    private ProductCatalog getProductCatalog() {
        Optional<ProductCatalog> productCatalog = productCatalogService.getProductCatalog().blockOptional();
        return productCatalog.orElseThrow(() -> new NullPointerException("Unable to get product catalog"));
    }

    private Flux<LegalEntity> createMambuLegalEntities() {
        return clientsService.getAllClients(mambuBootstrapTaskConfiguration.getMambuBranchId(), mambuBootstrapTaskConfiguration.getMambuCentreId())
            .filter(this::filterClient)
            .map(client -> {
                String fullName = client.getFirstName() + " " + client.getLastName();
                User user = setupUser(client, fullName);
                JobProfileUser jobProfileUser = setupJobProfileUser(user);
                return createMambuLegalEntity(client, fullName, user, jobProfileUser);
            })
            .collectList()
            .map(legalEntities -> {
                Comparator<LegalEntity> comparing = Comparator.comparing(LegalEntity::getName);
                Set<LegalEntity> uniqueLegalEntities = distinct(legalEntities, Comparator.comparing(LegalEntity::getName));
                log.info("Unique name legal entities: {} from: {}", uniqueLegalEntities.size(), legalEntities.size());
                uniqueLegalEntities = distinct(uniqueLegalEntities, (l1, l2) -> {
                    String emailL1 = l1.getUsers().stream().findFirst().get().getUser().getEmailAddress().getAddress();
                    String emaill2 = l2.getUsers().stream().findFirst().get().getUser().getEmailAddress().getAddress();
                    return emailL1.compareTo(emaill2);
                });
                log.info("Unique email legal entities: {} from: {}", uniqueLegalEntities.size(), legalEntities.size());
                return uniqueLegalEntities;
            })
            .flatMapIterable(Function.identity());
    }

    public Set<LegalEntity> distinct(Collection<LegalEntity> input, Comparator<LegalEntity> comparator) {
        TreeSet<LegalEntity> result = new TreeSet<>(comparator);
        result.addAll(input);
        return result;
    }

    public List<Pattern> getNameFilterPatterns() {
        if (this.nameFilterPatterns == null) {
            this.nameFilterPatterns = this.mambuBootstrapTaskConfiguration.getCustomerNameFilters().stream()
                .map(Pattern::compile)
                .collect(Collectors.toList());
        }
        return nameFilterPatterns;
    }

    private boolean filterClient(Client client) {
        String name = getClientFullName(client);
        boolean accepted = getNameFilterPatterns().stream()
            .map(pattern -> pattern.matcher(name))
            .noneMatch(Matcher::find);
        log.info("Client: {} matched name filter patterns: {}", name, accepted);
        return accepted;
    }

    @NotNull
    private String getClientFullName(Client client) {
        String name = client.getFirstName();
        if (client.getMiddleName() != null) {
            name += " " + client.getMiddleName();
        }
        name += " " + client.getLastName();
        return name;
    }

    private LegalEntity createMambuLegalEntity(com.backbase.mambu.clients.model.Client client, String fullName, User user, JobProfileUser jobProfileUser) {
        LegalEntity legalEntity = new LegalEntity();
        legalEntity.setParentExternalId(mambuBootstrapTaskConfiguration.getParentLegalEntityExternalId());
        legalEntity.setName(fullName);
        legalEntity.setExternalId(client.getId());
        legalEntity.setAdministrators(Collections.singletonList(user));
        legalEntity.setLegalEntityType(LegalEntityType.CUSTOMER);
        legalEntity.addUsersItem(jobProfileUser);
        legalEntity.setRealmName(mambuBootstrapTaskConfiguration.getLegalEntity().getRealmName());
        return legalEntity;
    }

    private JobProfileUser setupJobProfileUser(User user) {
        JobProfileUser jobProfileUser = new JobProfileUser();
        jobProfileUser.setUser(user);
        jobProfileUser.setReferenceJobRoleNames(mambuBootstrapTaskConfiguration.getDefaultReferenceJobRoleNames());
        return jobProfileUser;
    }

    private User setupUser(com.backbase.mambu.clients.model.Client client, String fullName) {
        String emailAddress = client.getEmailAddress();
        String phoneNumber = client.getHomePhone();
        if (StringUtils.isEmpty(emailAddress)) {
            emailAddress = "unknown@unknown.unknown";
        }
        if (StringUtils.isEmpty(phoneNumber)) {
            phoneNumber = "xxx-xxx-xxx";
        }

        User user = new User();
        user.setExternalId(client.getId());
        user.setFullName(fullName);
        user.setEmailAddress(new EmailAddress().address(emailAddress));
        user.setMobileNumber(new PhoneNumber().number(phoneNumber));
        user.setIdentityLinkStrategy(IdentityUserLinkStrategy.CREATE_IN_IDENTITY);
        return user;
    }

    private void setupLegalEntityHierarchy() {
        log.info("Setting up Root Legal Entity Hierarchy");
        LegalEntity legalEntity = mambuBootstrapTaskConfiguration.getLegalEntity();
        if (legalEntity == null) {
            log.error("Failed to load Legal Entity Structure");
            System.exit(1);
        } else {
            log.info("Bootstrapping Root Legal Entity Structure: {}", legalEntity.getName());
            List<LegalEntity> aggregates = Collections.singletonList(mambuBootstrapTaskConfiguration.getLegalEntity());

            Flux.fromIterable(aggregates)
                .map(LegalEntityTask::new)
                .flatMap(legalEntitySaga::executeTask)
                .doOnNext(StreamTask::logSummary)
                .doOnError(StreamTaskException.class, throwable -> {
                    throwable.getTask().logSummary();
                    log.error("Failed to setup Legal Entity Hierarchy", throwable);
                })

                .collectList()
                .block();
            log.info("Finished bootstrapping Legal Entity Structure");
        }
    }

    private Mono<Tuple2<LegalEntity, List<TransactionIds>>> ingestTransactions(LegalEntity legalEntity) {

        List<CurrentAccount> currentAccounts = legalEntity.getProductGroups().stream()
            .flatMap(productGroup -> productGroup.getCurrentAccounts().stream())
            .collect(Collectors.toList());

        return Flux.fromIterable(currentAccounts)
            .publishOn(single)
            .filter(currentAccount -> Objects.nonNull(currentAccount.getExternalId()))
            .map(currentAccount -> depositTransactionsService.getTransactionItemsForOutbound(currentAccount.getExternalId(), null))
            .flatMap(transactionService::processTransactions)
            .delayElements(Duration.ofSeconds(2))
            .collectList()
            .map(transactionIds -> Tuples.of(legalEntity, transactionIds));

    }

    private Mono<LegalEntity> setupMambuProducts(LegalEntity legalEntity, ProductCatalog productCatalog) {
        Mono<List<CurrentAccount>> depositAccounts = this.ingestDepositAccounts(legalEntity, productCatalog);
        Mono<List<Loan>> loans = this.ingestLoans(legalEntity, productCatalog);
        return Mono.just(legalEntity)
            .zipWith(
                Mono.zip(depositAccounts, loans), (actual, products) -> {
                    ProductGroup productGroup = new ProductGroup();
                    productGroup.setName("Mambu Products");
                    productGroup.setCurrentAccounts(products.getT1());
                    productGroup.setLoans(products.getT2());
                    productGroup.setUsers(legalEntity.getUsers());
                    actual.addProductGroupsItem(productGroup);
                    return legalEntity;
                }
            );
    }

    private Mono<List<CurrentAccount>> ingestDepositAccounts(LegalEntity legalEntity, ProductCatalog productCatalog) {
        return depositAccountsService.getAllDepositAccounts(legalEntity.getExternalId())
            .filter(depositAccount -> {
                assert depositAccount.getCurrencyCode() != null;
                return depositAccount.getCurrencyCode().equals("EUR");
            })
            .map(productMapper::mapMambuToDbs)
            .flatMap(currentAccount -> {
                Optional<ProductType> productType = getProductType(productCatalog, currentAccount.getProductTypeExternalId());
                if (!productType.isPresent()) {
                    return Mono.just(currentAccount)
                        .zipWith(createProductTypeFromMambuDepositProduct(currentAccount.getProductTypeExternalId(), productCatalog),
                            (arr, productType1) -> {
                                arr.setProductTypeExternalId(productType1.getExternalId());
                                return arr;
                            }

                        );
                } else {
                    return Mono.just(currentAccount);
                }
            })
            .collectList();
    }

    private Optional<ProductType> getProductType(ProductCatalog productCatalog, String productTypeExternalId) {
        List<ProductType> productTypes = productCatalog.getProductTypes();
        return productTypes.stream().filter(type -> {
            String externalId = type.getExternalProductId();
            return externalId.equals(productTypeExternalId);
        }).findFirst();
    }

    private Mono<List<Loan>> ingestLoans(LegalEntity legalEntity, ProductCatalog productCatalog) {
        return loanService.getAllLoanAccounts(legalEntity.getExternalId())
            .map(loanAccount -> productMapper.mapMambuToDbs(loanAccount, legalEntity, mambuBootstrapTaskConfiguration.getDefaultLoanCurrency()))
            .flatMap(loan -> {
                Optional<ProductType> productType = getProductType(productCatalog, loan.getProductTypeExternalId());
                if (!productType.isPresent()) {
                    return Mono.just(loan).zipWith(createProductTypeFromMambuLoanProduct(loan.getProductTypeExternalId(), productCatalog),
                        (arr, productType1) -> {
                            arr.setProductTypeExternalId(productType1.getExternalId());
                            return arr;
                        });
                } else {
                    return Mono.just(loan);
                }
            })
            .collectList();
    }


    private Mono<ProductType> createProductTypeFromMambuDepositProduct(String productTypeKey, ProductCatalog
        productCatalog) {

        return depositProductsApi.getById(productTypeKey, "FULL")
            .flatMap(depositProduct -> {

                Map<String, String> depositAccountTypeMapping = getMambuProductConfigurationProperties().getDepositAccountTypeMapping();

                String productKindName = depositAccountTypeMapping.get(depositProduct.getType().getValue());
                String name = depositProduct.getName();
                String id = depositProduct.getId();

                return createProductType(productTypeKey, productCatalog, productKindName, name, id);

            })
            .switchIfEmpty(Mono.error(NullPointerException::new));
    }

    private MambuConfigurationProperties.Mapping.MambuProductConfigurationProperties getMambuProductConfigurationProperties
        () {
        MambuConfigurationProperties.Mapping mapping = mambuConfigurationProperties.getMapping();
        return mapping.getProduct();
    }

    private Mono<ProductType> createProductTypeFromMambuLoanProduct(String productTypeKey, ProductCatalog
        productCatalog) {

        return loanProductsApi.getById(productTypeKey, "FULL")
            .flatMap(loanProduct -> {

                String productKindName = getMambuProductConfigurationProperties().getLoanAccountTypeMapping().get(loanProduct.getType().getValue());
                String name = loanProduct.getName();
                String id = loanProduct.getId();

                return createProductType(productTypeKey, productCatalog, productKindName, name, id);

            });
    }

    private Mono<ProductType> createProductType(String productTypeKey, ProductCatalog productCatalog, String
        productKindName, String name, String id) {

        Optional<ProductType> first = productCatalog.getProductTypes().stream().filter(productType -> {

            String externalTypeId = productType.getExternalTypeId();
            if (externalTypeId == null) {
                externalTypeId = productType.getExternalId();
            }
            return externalTypeId != null && externalTypeId.equals(id);
        }).findFirst();

        if (first.isPresent()) {
            ProductType productType = first.get();
            return Mono.just(productType);
        }

        if (productKindName == null) {
            return Mono.error(new Exception("Missing mapping of " + productKindName + " in Mambu Deposit Product Configuration Properties"));
        }
        Optional<ProductKind> existingProductKind = productCatalog.getProductKinds().stream().filter(productKind -> productKind.getKindName().equals(productKindName)).findFirst();

        if (existingProductKind.isPresent()) {
            ProductKind productKind = existingProductKind.get();

            ProductType productType = new ProductType();
            productType.setProductKind(productKind);
            productType.setTypeName(name);
            productType.setExternalTypeId(id);
            productType.setExternalProductId(productTypeKey);
            productType.setExternalProductTypeId(id);

            productCatalog.addProductTypesItem(productType);

            return Mono.just(productType);

        } else {
            return Mono.error(new Exception("Invalid Product Kind: " + productKindName + " for Mambu Product: " + name));
        }
    }

}
