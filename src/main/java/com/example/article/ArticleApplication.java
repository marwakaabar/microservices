package com.example.article;

import com.example.article.entities.Article;
import com.example.article.repositories.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ArticleApplication {
//    l'url pour se connecter est http://localhost:9090/h2 (username par défaut est sa)
//    ~/Database/Data/Pay


    public static void main(String[] args) {


        SpringApplication.run(ArticleApplication.class, args);


    }

    @Autowired
    private ArticleRepo articleRepo;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            articleRepo.save(new Article("rfrfrf", "rfff"));
            articleRepo.save(new Article("titre 2", "desc 2 "));
            articleRepo.findAll().forEach(System.out::println);


        };

    }
}
