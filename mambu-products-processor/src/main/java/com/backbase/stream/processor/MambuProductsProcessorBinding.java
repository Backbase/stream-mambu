package com.backbase.stream.processor;

import com.backbase.stream.cursor.model.IngestionCursor;
import com.backbase.stream.legalentity.model.ProductGroup;
import com.backbase.stream.mambu.mapper.ProductMapper;
import com.backbase.stream.mambu.service.DepositAccountsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
@Slf4j
@AllArgsConstructor
public class MambuProductsProcessorBinding {

    private final DepositAccountsService reactiveDepositAccountsService;
    private final ProductMapper productMapper;


    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public ProductGroup accept(IngestionCursor ingestionCursor) {

        if (ingestionCursor.getAdditionalProperties() != null && !ingestionCursor.getAdditionalProperties().containsKey("product")) {
            String accountHolderId = ingestionCursor.getExternalLegalEntityId();
            log.info("Querying Mambu for Account Holder: {}", accountHolderId);

            return reactiveDepositAccountsService.getAllDepositAccounts(accountHolderId)
                .collectList()
                .map(depositAccount -> productMapper.map(depositAccount, ingestionCursor))
                .block();

        } else {
            log.debug("Ignoring ingestion cursors with product already filled in. No need to get products");
            return null;
        }
    }
}
