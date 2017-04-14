package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 评论表
 * Created by Taoyongpan on 2017/4/13.
 */
public class Discuss {

    @Id
    private Integer id;
    //用户ID
    @Column( name = "user_id")
    private Integer userId;

    //文章ID
    @Column( name = "article_id")
    private Integer articleId;

    //文章评论
    @Column(name = "discuss")
    private String discuss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }
}
