package com.a.mapper;

import com.a.entity.Article;
import org.apache.ibatis.annotations.Param;


public interface IArticleMapper {

    Article findSingleById(@Param("a_id") Integer id);

    Integer add(@Param("art") Article art);
}
