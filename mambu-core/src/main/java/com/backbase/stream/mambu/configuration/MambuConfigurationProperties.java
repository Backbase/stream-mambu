package com.backbase.stream.mambu.configuration;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Mambu Configuration Properties.
 */
@ConfigurationProperties(prefix = "backbase.stream.mambu")
@Slf4j
@Data
public class MambuConfigurationProperties {

    /**
     * The base URL of Mambu.
     */
    private String baseUrl;

    /**
     * The username.
     */
    private String username;

    /**
     * The password.
     */
    private String password;

    private Mapping mapping;

    @Data
    public static class Mapping {

        private MambuProductConfigurationProperties product;
        private MambuTransactionConfigurationProperties transactions;

        @Data
        public static class MambuProductConfigurationProperties {

            /**
             * Mapping between Mambu Deposit Accounts and Backbase DBS Product Kinds.
             */
            private final Map<String, String> depositAccountTypeMapping = new HashMap<>();

            /**
             * Mapping between Mambu Loan Accounts and Backbase DBS Product Kinds.
             */
            private final Map<String, String> loanAccountTypeMapping = new HashMap<>();

        }

        @Data
        public static class MambuTransactionConfigurationProperties {

            /**
             * Mapping between Mambu Transaction Type Groups and Backbase DBS Transaction Type Groups.
             */
            private Map<String, String> transactionTypeGroupMap = new HashMap<>();

            /**
             * Mapping between Mambu Transaction Type and Backbase DBS Transaction Type.
             */
            private Map<String, String> transactionTypeMap = new HashMap<>();

        }
    }

}

