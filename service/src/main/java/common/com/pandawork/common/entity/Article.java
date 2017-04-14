package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Article实体
 * Created by Taoyongpan on 2017/4/9.
 */
@Table(name = "t_article")
@Entity
public class Article {

    @Id
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "plate_id")
    private int plateId;
    @Column(name = "forum_id")
    private int forumId;
    @Column(name = "article_title")
    private int articleTitle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPlateId() {
        return plateId;
    }

    public void setPlateId(int plateId) {
        this.plateId = plateId;
    }

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    public int getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(int articleTitle) {
        this.articleTitle = articleTitle;
    }
}
