package com.example.micro_service;

import com.example.micro_service.Repository.PaysRepository;
import com.example.micro_service.entities.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
    }

    @Autowired
    private PaysRepository repository;
    @Bean
    ApplicationRunner init(){
        return (args )-> {
            repository.save(new Pay("ile d'amour","France","Paris"));
            repository.save(new Pay("tunisie verte","Tunis","tunis"));
            repository.findAll().forEach(System.out::println);


        };
    }
}
