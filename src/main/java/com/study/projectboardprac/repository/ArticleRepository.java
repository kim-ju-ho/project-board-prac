package com.study.projectboardprac.repository;

import com.study.projectboardprac.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
