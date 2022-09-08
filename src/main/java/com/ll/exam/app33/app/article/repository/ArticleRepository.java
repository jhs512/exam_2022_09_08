package com.ll.exam.app33.app.article.repository;

import com.ll.exam.app33.app.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
