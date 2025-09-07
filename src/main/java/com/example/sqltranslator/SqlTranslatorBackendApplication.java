package com.example.sqltranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.sqltranslator.repository")
public class SqlTranslatorBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlTranslatorBackendApplication.class, args);
    }

}