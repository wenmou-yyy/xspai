package com.a.controller;

import com.a.entity.Article;
import com.a.service.ArticleService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * @Author liuxin
 * @Date 2019.09.30.0030 14:37
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/save")
    public String articleSave(Article art){
        Integer num = articleService.add(art);
        return "ok";
    }

    @RequestMapping(value = "/show",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String articleShow(HttpServletRequest request){

//        Integer id = (Integer) request.getSession().getAttribute("a_id");
        Integer id = 17;
        Article singleArticle = articleService.findSingleById(id);
        String jsonString = JSONObject.toJSONString(singleArticle);
        return jsonString;
    }


}
