package org.example;

import org.example.model.Developer;
import org.example.model.Employee;
import org.example.model.Manager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class AppConfig{

    @Bean
    public Manager manager(){
        return new Manager();
    }

    @Bean
    public Developer developer(){
        return new Developer();
    }

    @Bean
    public Employee employee(){
        return new Employee();
    }
}