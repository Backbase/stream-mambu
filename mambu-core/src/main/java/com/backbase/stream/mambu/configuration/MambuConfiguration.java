package com.backbase.stream.mambu.configuration;

import com.backbase.mambu.clients.api.ClientsApi;
import com.backbase.mambu.deposit.accounts.api.DepositAccountsApi;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;
import com.backbase.mambu.deposit.transactions.ApiClient;
import com.backbase.mambu.deposit.transactions.api.DepositTransactionsApi;
import com.backbase.mambu.loan.products.api.LoanProductsApi;
import com.backbase.mambu.loans.api.LoanAccountsApi;
import com.backbase.stream.mambu.mapper.ProductMapper;
import com.backbase.stream.mambu.mapper.TransactionMapper;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import com.backbase.stream.webclient.DbsWebClientConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.DateFormat;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Mambu Application Configuration.
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Configuration
@EnableConfigurationProperties({
    MambuConfigurationProperties.class
})
@Import(DbsWebClientConfiguration.class)
@AllArgsConstructor
public class MambuConfiguration {

    private final MambuConfigurationProperties mambuConfigurationProperties;

    @Bean
    public DepositTransactionsService reactiveDepositTransactionsService(
        DepositTransactionsApi depositTransactionsApi,
        TransactionMapper transactionMapper) {
        return new DepositTransactionsService(depositTransactionsApi, transactionMapper);
    }

    @Bean
    public LoanAccountsApi loanAccountsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                           ObjectMapper objectMapper,
                                           DateFormat dateFormat) {
        com.backbase.mambu.loans.ApiClient apiClient = new com.backbase.mambu.loans.ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new LoanAccountsApi(apiClient);
    }

    @Bean
    public DepositTransactionsApi depositTransactionsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                                         ObjectMapper objectMapper,
                                                         DateFormat dateFormat) {
        ApiClient apiClient = new ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new DepositTransactionsApi(apiClient);
    }

    @Bean
    public ClientsApi clientsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                 ObjectMapper objectMapper,
                                 DateFormat dateFormat) {
        com.backbase.mambu.clients.ApiClient apiClient = new com.backbase.mambu.clients.ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new ClientsApi(apiClient);
    }

    @Bean
    public DepositAccountsApi depositAccountsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                                 ObjectMapper objectMapper,
                                                 DateFormat dateFormat) {
        com.backbase.mambu.deposit.accounts.ApiClient apiClient = new com.backbase.mambu.deposit.accounts.ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new DepositAccountsApi(apiClient);
    }

    @Bean
    public LoanProductsApi loanProductsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                           ObjectMapper objectMapper,
                                           DateFormat dateFormat) {
        com.backbase.mambu.loan.products.ApiClient apiClient = new com.backbase.mambu.loan.products.ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new LoanProductsApi(apiClient);
    }

    @Bean
    public DepositProductsApi depositProductsApi(@Qualifier("mambu-webclient") WebClient webClient,
                                                 ObjectMapper objectMapper,
                                                 DateFormat dateFormat) {
        com.backbase.mambu.deposit.products.ApiClient apiClient = new com.backbase.mambu.deposit.products.ApiClient(webClient, objectMapper, dateFormat);
        apiClient.setBasePath(mambuConfigurationProperties.getBaseUrl());
        return new DepositProductsApi(apiClient);
    }


    @Bean
    public TransactionMapper transactionMapper(MambuConfigurationProperties mambuTransactionConfigurationProperties) {
        return new TransactionMapper(mambuTransactionConfigurationProperties);
    }

    @Bean
    public ProductMapper productMapper() {
        return new ProductMapper();
    }

    @Bean(name = "mambu-webclient")
    public WebClient setupWebClient(WebClient.Builder builder) {
        String username = mambuConfigurationProperties.getUsername();
        String password = mambuConfigurationProperties.getPassword();
        ExchangeFilterFunction basicAuthentication = ExchangeFilterFunctions.basicAuthentication(username, password);
        return builder.filter(basicAuthentication)
            .baseUrl(mambuConfigurationProperties.getBaseUrl())
            .build();
    }
}

