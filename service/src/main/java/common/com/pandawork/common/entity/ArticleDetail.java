package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * 文章发帖的具体信息
 * Created by Taoyongpan on 2017/4/13.
 */
public class ArticleDetail {
    @Id
    private Integer id;

    @Column( name = "article_id")
    private Integer articleId;
    //文章标题
    private String title;
    //文章作者
    private String author;
    //文章内容
    private String content;
    //文章日期
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
