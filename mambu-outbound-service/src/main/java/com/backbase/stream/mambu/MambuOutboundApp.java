package com.backbase.stream.mambu;


import com.backbase.stream.start.mvc.EnableStartPage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableStartPage
public class MambuOutboundApp {

    public static void main(String[] args) {
        SpringApplication.run(MambuOutboundApp.class, args);
    }
}

