package com.demo.article.controller;

import com.demo.article.entity.Article;
import com.demo.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 文章基础信息(Article)表控制层
 *
 * @author makejava
 * @since 2021-02-14 16:32:33
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Autowired
    private ArticleService articleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Article selectOne(String id) {
        return this.articleService.queryById(id);
    }

}