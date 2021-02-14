package com.demo.article.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.article.entity.Article;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 文章基础信息(Article)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-14 16:32:33
 */
public interface ArticleDao extends BaseMapper<Article> {


}