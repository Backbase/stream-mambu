package com.backbase.stream.mambu.configuration;

import com.backbase.stream.legalentity.model.LegalEntity;
import java.util.Collections;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bootstrap", ignoreInvalidFields = true)
@Data
@NoArgsConstructor
public class MambuBootstrapTaskConfiguration {

    /**
     * The branch id/key to search for.
     */
    private String mambuBranchId;

    /**
     * The centre id/key to search for.
     */
    private String mambuCentreId;


    /**
     * The centre id/key to search for.
     */
    private String parentLegalEntityExternalId = "mambu-bank";


    private List<String> referenceJobRoleNames = Collections.emptyList();


    /**
     * Default Loan Currency
     */
    private String defaultLoanCurrency;

    /**
     * Ingest Product Catalog
     */
    private boolean ingestProductCatalog = true;

    /**
     * Ingest Mambu Clients
     */
    private boolean ingestMambuClients = true;

    /**
     * Ingest Mambu Transactions
     */
    private boolean ingestMambuTransactions = false;


    /**
     * The Root Legal Entity including Subsidiaries
     */
    private LegalEntity legalEntity;

}
