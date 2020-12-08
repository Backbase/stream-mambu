package com.backbase.stream.mambu.service;

import com.backbase.mambu.clients.api.ClientsApi;
import com.backbase.mambu.clients.model.Client;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@AllArgsConstructor
@Service
public class ClientsService {

    private final ClientsApi clientsApi;


    private void logClients(List<Client> clients) {
        log.info("Retrieved {} clients: {}", clients.size(),
            clients.stream().map(Client::getFirstName).collect(Collectors.joining(", ")));
    }

    @NotNull
    public Flux<Client> getAllClients(String branchId, String centreId) {
        int limit = 100;
        final int[] offset = {0};
        return Mono.from(getClients(branchId, centreId, limit, offset[0]))
            .expand(clients -> {
                if (clients.isEmpty()) {
                    log.info("We reached the end. Return empty mono");
                    return Mono.empty();
                } else {
                    offset[0] = offset[0] + limit;
                    return getClients(branchId, centreId, limit, offset[0]);
                }
            })
            .flatMapIterable(Function.identity());
    }

    private Mono<List<Client>> getClients(String branchId, String centreId, int limit, int offset) {
        log.info("Getting {} clients with offset: {}", limit, offset);
        return clientsApi.getAll(
            offset,
            limit,
            "on",
            "FULL",
            null,
            null,
            null,
            branchId,
            centreId,
            null,
            "ACTIVE",
            null,
            null)
            .doOnError(WebClientResponseException.BadRequest.class, this::handleError)
            .collectList()
            .doOnNext(this::logClients);
    }

    private void handleError(WebClientResponseException badRequest) {
        String responseBodyAsString = badRequest.getResponseBodyAsString();
        int rawStatusCode = badRequest.getRawStatusCode();
        log.error("Error executing request: [{}] {}", rawStatusCode, responseBodyAsString);
    }
}
