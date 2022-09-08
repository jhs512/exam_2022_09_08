package com.ll.exam.app33.app.base;

import com.ll.exam.app33.app.article.entity.Article;
import com.ll.exam.app33.app.article.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"prod"})
public class ProdInitData {
    @Bean
    CommandLineRunner init(ArticleRepository articleRepository) {
        return args -> {
            articleRepository.save(Article.builder().subject("제목2").build());
        };
    }
}
