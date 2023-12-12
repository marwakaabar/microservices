package com.example.article.services;

import com.example.article.entities.Article;
import com.example.article.repositories.ArticleRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceIMPL implements IArticleService {


    private final ArticleRepo articleRepo;

    @Autowired
    public ArticleServiceIMPL(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }



    @Override
    public Article add(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public Article update(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public List<Article> getAll() {
        return (List<Article>) articleRepo.findAll();
    }

    @Override
    public Article getById(Long id) {
        return articleRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Article not found"));
    }

    @Override
    public boolean deleteById(Long id) {
        articleRepo.deleteById(id);
        return !articleRepo.existsById(id);
    }
}
