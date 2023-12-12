package com.example.article.controllers;

import com.example.article.entities.Article;
import com.example.article.services.IArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController {

    private final IArticleService articleService;

    public ArticleController(IArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getArticles() {
        return articleService.getAll();
    }

    @GetMapping("{id}")
    public Article getArticle(@PathVariable long id) {
        return articleService.getById(id);
    }

    @PostMapping
    public Article addArticle(@RequestBody Article article) {
        return articleService.add(article);
    }

    @PutMapping
    public Article updateArticle(@RequestBody Article article) {
        return articleService.update(article);
    }

    @DeleteMapping("{id}")
    public boolean deleteArticle(@PathVariable long id) {
        return articleService.deleteById(id);
    }
}
