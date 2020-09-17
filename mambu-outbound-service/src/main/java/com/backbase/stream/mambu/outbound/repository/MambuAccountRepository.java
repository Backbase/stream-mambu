package com.backbase.stream.mambu.outbound.repository;

import com.backbase.stream.mambu.outbound.model.MambuAccount;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface MambuAccountRepository extends ReactiveCrudRepository<MambuAccount, Integer> {

    Mono<MambuAccount> findByIban(String iban);


}
