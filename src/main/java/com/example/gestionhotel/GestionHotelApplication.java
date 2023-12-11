package com.example.gestionhotel;

import com.example.gestionhotel.Repository.HotelRepository;
import com.example.gestionhotel.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionHotelApplication {
//    l'url pour se connecter est http://localhost:9099/h2 (username par défaut est sa)
//    ~/Database/Data/Pay

    public static void main(String[] args) {
        SpringApplication.run(GestionHotelApplication.class, args);
    }

    @Autowired
    private HotelRepository hotelRepository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            hotelRepository.save(new Hotel("paradisiaque", "paradiaisques@gmail;com", "adresseParadisiaques", "12345678", 5));
            hotelRepository.save(new Hotel("Le Sultan", "LeSultan@gmail;com", "adresseleSultan", "12121236", 4));
            hotelRepository.findAll().forEach(System.out::println);


        };
    }

}
