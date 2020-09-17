package com.backbase.stream.mambu.outbound.configuration;

import com.backbase.stream.config.BackbaseStreamConfigurationProperties;
import com.backbase.stream.webclient.DbsWebClientConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@Slf4j
public class MambuOutboundAppConfiguration {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http.authorizeExchange()
            .anyExchange()
            .permitAll()
            .and()
            .csrf()
            .disable()
            .build();
    }

}
