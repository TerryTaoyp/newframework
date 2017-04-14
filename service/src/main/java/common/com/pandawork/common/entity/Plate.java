package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 论坛 板块分类
 * Created by Taoyongpan on 2017/4/13.
 */
public class Plate {
    @Id
    private Integer id;
    //板块 ID
    @Column( name = "plate_id")
    private Integer plateId;
    //板块名字
    @Column( name = "plate_name")
    private String plateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }
}
