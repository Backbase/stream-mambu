package com.backbase.stream.processor;

import com.backbase.dbs.transaction.presentation.service.model.TransactionItemPost;
import com.backbase.stream.cursor.model.IngestionCursor;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
@Slf4j
@AllArgsConstructor
public class MambuTransactionsProcessorBinding {

    private final DepositTransactionsService depositTransactionsService;

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public List<TransactionItemPost> accept(IngestionCursor ingestionCursor) {
        return depositTransactionsService.retrieveTransactions(ingestionCursor)
                .collectList()
                .block();
    }
}
