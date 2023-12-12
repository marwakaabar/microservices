package com.esprit.offre_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableWebFluxSecurity
public class OffreMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OffreMsApplication.class, args);
    }

}
