package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 根据板块对论坛分类
 * Created by Taoyongpan on 2017/4/13.
 */
public class Forum {

    @Id
    private  Integer id;
    //论坛名字
    private String forum;
    //板块ID
    @Column(name = "plate_id")
    private Integer plateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }
}
