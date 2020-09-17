package com.backbase.stream.mambu.service;

import com.backbase.mambu.clients.api.ClientsApi;
import com.backbase.mambu.clients.model.Client;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;

@Slf4j
@AllArgsConstructor
@Service
public class ClientsService {

    private final ClientsApi clientsApi;

    public Flux<Client> getAllClients(String branchId, String centreId) {
        return clientsApi.getAll(
            null,
            null,
            "on",
            "FULL",
            null,
            null,
            null,
            branchId,
            centreId,
            null,
            null,
            null,
            null)
            .doOnError(WebClientResponseException.BadRequest.class, this::handleError);

    }

    private void handleError(WebClientResponseException badRequest) {
        String responseBodyAsString = badRequest.getResponseBodyAsString();
        int rawStatusCode = badRequest.getRawStatusCode();
        log.error("Error executing request: [{}] {}", rawStatusCode, responseBodyAsString);
    }
}
