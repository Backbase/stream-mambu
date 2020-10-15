package com.backbase.stream.mambu.task;

import com.backbase.stream.mambu.configuration.MambuBootstrapConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.stereotype.Component;

@Component
@EnableTask
@RequiredArgsConstructor
public class BootstrapTask implements CommandLineRunner {

    private final MambuBootstrapConfiguration mambuBootstrapConfiguration;

    @Override
    public void run(String... args) throws Exception {
        mambuBootstrapConfiguration.execute();
    }
}
