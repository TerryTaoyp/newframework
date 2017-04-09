package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Article实体
 * Created by Taoyongpan on 2017/4/9.
 */
@Table(name = "t_article")
@Entity
public class Article {

    private int id;
    @Column(name = "user_id")
    private int userid;
    @Column(name = "plate_id")
    private int plateid;
    @Column(name = "forum_id")
    private int forumid;
    @Column(name = "article_id")
    private int articleid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPlateid() {
        return plateid;
    }

    public void setPlateid(int plateid) {
        this.plateid = plateid;
    }

    public int getForumid() {
        return forumid;
    }

    public void setForumid(int forumid) {
        this.forumid = forumid;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }
}
