package org.sensibilisation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SensibilisationApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SensibilisationApiApplication.class, args);
    }
}