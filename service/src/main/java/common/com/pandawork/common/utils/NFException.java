package com.pandawork.common.utils;

import com.pandawork.core.common.exception.IBizExceptionMes;

/**
 * NFException
 *
 * @author: zhangteng
 * @time: 2015/3/24 16:55
 */
public enum  NFException implements IBizExceptionMes {
    SystemException("系统内部异常", 1),



    UnameNotNull("用户名不能为空",10001),
    UpwdNotNull("密码不能为空",10002),
    Upwd1NotNull("密码不能为空",10003),
    QueryUserByNameFailed("根据姓名查找用户信息失败",10004),
    DelUserFailed("删除用户失败",10005),
    UpdateUserFailed("更新用户失败",10006),
    QueryUserById("根据用户ID查找失败",10007),
    QueryUserByName("根据用户名查找失败",10008),
    ListAll("列出所有用户失败",10009),
    CountAll("对所有用户计数失败",10010)

    ;

    private String msg;

    private Integer code;

    NFException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }


    @Override
    public String getMes() {
        return null;
    }

    @Override
    public int getCode() {
        return 0;
    }
}
