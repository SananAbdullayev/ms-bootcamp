package az.ms.microservicebootcamp.controller;

import az.ms.microservicebootcamp.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope(value = "singleton")
    public Student getStudent() {
        return new Student();
    }
}
