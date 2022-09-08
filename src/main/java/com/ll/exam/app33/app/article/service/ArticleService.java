package com.ll.exam.app33.app.article.service;

import com.ll.exam.app33.app.article.entity.Article;
import com.ll.exam.app33.app.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }
}
