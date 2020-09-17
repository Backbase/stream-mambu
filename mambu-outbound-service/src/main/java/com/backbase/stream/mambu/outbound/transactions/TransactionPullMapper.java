package com.backbase.stream.mambu.outbound.transactions;

import com.backbase.stream.dbs.transactions.pull.model.TransactionItem;
import org.mapstruct.Mapper;

@Mapper
public interface TransactionPullMapper {

    TransactionItem map(com.backbase.dbs.transaction.presentation.service.model.TransactionItem post) ;


}
