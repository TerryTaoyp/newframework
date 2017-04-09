package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User实体
 * Created by Taoyongpan on 2016/11/5.
 */
@Table( name = "t_user" )
@Entity
public class User {
    //ID用户
    @Id
    private Integer id;
    //用户名
    @Column(name = "username")
    private String username;
    //密码
    private String password;
    //重复密码
    private String password1;
    //是否为管理员
    @Column( name = "is_admin")
    private Integer isadmin;
    //该用户是否可用
    private Integer available;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}
