package com.demo.article.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 文章基础信息(Article)实体类
 *
 * @author makejava
 * @since 2021-02-14 16:32:33
 */
@Data
@TableName("article")
public class Article implements Serializable {
    private static final long serialVersionUID = -74711528162206986L;
    /**
    * id
    */
    @TableId(type = IdType.INPUT)
    private String id;
    /**
    * 专栏id
    */
    private String columnId;
    /**
    * 用户id
    */
    private String userId;
    /**
    * 标题
    */
    private String title;
    /**
    * 文章正题
    */
    private Object content;
    /**
    * 创建日期
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 是否公开
    */
    private String isPublic;
    /**
    * 是否置顶
    */
    private String isTop;
    /**
    * 浏览量
    */
    private Integer visits;
    /**
    * 点赞数
    */
    private Integer thumbup;
    /**
    * 评论数
    */
    private Integer comment;
    /**
    * 审核状态
    */
    private String state;
    /**
    * 频道id
    */
    private String channelId;
    /**
    * url
    */
    private String url;
    /**
    * 类型
    */
    private String type;
}