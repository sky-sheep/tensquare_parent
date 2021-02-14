package com.demo.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.article.entity.Article;
import com.demo.article.dao.ArticleDao;
import com.demo.article.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章基础信息(Article)表服务实现类
 *
 * @author makejava
 * @since 2021-02-14 16:32:33
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao,Article> implements ArticleService{

}