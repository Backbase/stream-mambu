package com.backbase.stream.mambu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MambuBootstrapTaskApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MambuBootstrapTaskApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

}