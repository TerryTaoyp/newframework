package com.pandawork.service;


import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 *userService层
 * Created by Taoyongpan on 2016/11/5.
 */
public interface UserService {
    /**
     *增加用户
     * @param user
     * @throws SSException
     */
    public void newUser(User user)throws SSException;

    /**
     * 根据ID删除用户
     * @param id
     * @throws SSException
     */
    public void DelUser(int id)throws SSException;

    /**
     * 更新用户信息
     * @param user
     * @throws SSException
     */
    public void UpdateUser(User user)throws SSException;

    /**
     * 根据 用户ID查找用户
     * @param id
     * @throws SSException
     */
    public void QueryById(int id)throws SSException;

    /**
     * 根据用户名查找用户
     * @param username
     * @throws SSException
     */
    public void QueryByName(String username)throws SSException;

    /**
     * 列出所有用户
     * @throws SSException
     */
    public List<User> ListAll()throws SSException;

    /**
     * 对所有用户计数
     * @return
     * @throws SSException
     */
    public int CountAll()throws SSException;

    /**
     * 根据用户等级查找
     * @param isadmin
     * @return
     * @throws SSException
     */
    public List<User> queryByIsAdmin(int isadmin)throws SSException;

}
