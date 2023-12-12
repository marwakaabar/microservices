package com.example.article.repositories;

import com.example.article.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article,Long> {

}
