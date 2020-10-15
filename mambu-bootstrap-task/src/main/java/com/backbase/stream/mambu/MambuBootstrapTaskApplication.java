package com.backbase.stream.mambu;

import com.backbase.stream.mambu.configuration.MambuBootstrapConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class MambuBootstrapTaskApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MambuBootstrapTaskApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }


}

