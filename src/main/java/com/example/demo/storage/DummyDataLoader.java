package com.example.demo.storage;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyDataLoader {
    private static final Logger log = LoggerFactory.getLogger(DummyDataLoader.class);

    @Bean
    CommandLineRunner initDataBase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Luke Skywalker", "Jedi")));
            log.info("Preloading " + repository.save(new Employee("Emperor Palpatine", "Sith")));
            log.info("Preloading " + repository.save(new Employee("Cal Kestis", "Jedi")));
        };
    }
}
