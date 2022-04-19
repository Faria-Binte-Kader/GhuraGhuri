package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Article;
import com.example.ghuraghuri.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleService {
    public Article newArticle(Article article);
    public void deleteArticle(Article article);
    public List<Article> getAllArticle();
    public List<Article> getTopArticle();
}
