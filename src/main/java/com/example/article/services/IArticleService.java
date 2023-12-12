package com.example.article.services;

import com.example.article.entities.Article;

import java.util.List;

public interface IArticleService {

    Article add(Article article);

    Article update(Article article);

    List<Article> getAll();

    Article getById(Long id);

    boolean deleteById(Long id);

}
