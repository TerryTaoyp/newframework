package com.pandawork.common.entity;

import javax.persistence.Id;

/**
 * 个人中心管理
 * Created by Taoyongpan on 2017/4/13.
 */
public class Myself {
    @Id
    private Integer id;
    //收藏,存入文章ID
    private Integer favorites;
    //浏览记录，存入文章ID
    private Integer history;
    //发帖，存入文章ID
    private Integer post;
    //消息，存入discuss_id
    private Integer news;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getNews() {
        return news;
    }

    public void setNews(Integer news) {
        this.news = news;
    }
}
