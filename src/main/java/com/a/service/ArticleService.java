package com.a.service;

import com.a.entity.Article;


public interface ArticleService {
    Article findSingleById(Integer id);

    Integer add(Article art);
}
