package com.backbase.stream;

import com.backbase.stream.mambu.configuration.MambuConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@Slf4j
@SpringBootApplication
@EnableConfigurationProperties({
    MambuConfigurationProperties.class
})
public class MambuTransactionsProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MambuTransactionsProcessorApplication.class, args);
    }

}
