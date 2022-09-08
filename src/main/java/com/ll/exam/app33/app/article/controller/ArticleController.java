package com.ll.exam.app33.app.article.controller;

import com.ll.exam.app33.app.article.entity.Article;
import com.ll.exam.app33.app.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> articles() {
        return articleService.getArticles();
    }
}
