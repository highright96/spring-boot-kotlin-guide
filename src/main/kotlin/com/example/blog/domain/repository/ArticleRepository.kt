package com.example.blog.domain.repository

import com.example.blog.domain.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findAllByOrderByAddedAtDesc(): List<Article>
}