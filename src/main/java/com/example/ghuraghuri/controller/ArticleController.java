package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Article;
import com.example.ghuraghuri.repository.ArticleRepository;
import com.example.ghuraghuri.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("/add")
    public String addUser(@RequestBody Article article){
        articleService.newArticle(article);
        return "New article added";
    }

    @GetMapping("/getAllArticles")
    public List<Article> getAllLocations(){
        return articleService.getAllArticle();
    }

    @GetMapping("/getTopArticles")
    public List<Article> getTopLocations(){
        return articleService.getTopArticle();
    }


}
