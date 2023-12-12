package com.example.microo;

import com.example.microo.entities.Reservation;
import com.example.microo.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableDiscoveryClient
public class MicrooApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrooApplication.class, args);
    }

    @Autowired
    private ReservationRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args) ->{
            //save
            repository.save(new Reservation("marwa","reservation chambre", LocalDate.now()));
            repository.save(new Reservation("yasmine","reservation chambre", LocalDate.now()));
            repository.save(new Reservation("rayen","reservation chambre", LocalDate.now()));
            //fetch
            repository.findAll().forEach(System.out::println);
        };
    }

}
