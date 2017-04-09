package com.pandawork.test;

import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试service页面
 * Created by Taoyongpan on 2016/11/5.
 */
public class UserServiceTest extends AbstractTestCase {
    @Autowired
    UserService userService;

    /**
     * 测试新增用户信息
     * @throws SSException
     */
    @Test
    public void testNewUser() throws SSException{
        User user = new User();
        user.setUsername("tao4");
        user.setPassword("123456");
        user.setPassword1("123456");
        user.setIsadmin(0);
        user.setAvailable(1);
        userService.newUser(user);
    }

    /**
     * 根据ID删除用户
     * @throws SSException
     */
    @Test
    public void testDelUser()throws SSException{
      userService.DelUser(1);
    }

    /**
     * 根据ID更新用户信息
     * @throws SSException
     */
    @Test
    public void testUpdateUser()throws SSException{
        User user = new User();
        user.setId(2);
        user.setUsername("tao4");
        user.setPassword("123456");
        user.setPassword1("123456");
        user.setIsadmin(0);
        user.setAvailable(1);
        userService.UpdateUser(user);
    }

    /**
     * 测试根据id查找用户
     * @throws SSException
     */
    @Test
    public void testQueryByID()throws SSException{
        userService.QueryById(1);
    }

    /**
     * 测试根据用户名查找用户
     * @throws SSException
     */
    @Test
    public void testQueryByName()throws SSException{
        userService.QueryByName("tao2");
    }

    /**
     * 测试列出所有用户
     * @throws SSException
     */
    @Test
    public void testListAll()throws SSException{
        userService.ListAll();
    }

    /**
     * 测试对所有用户计数
     * @throws SSException
     */
    @Test
    public void testCountAll()throws SSException{
        userService.CountAll();
    }
    /**
     * 测试根据isadmin查找用户
     * @throws Exception
     */
    @Test
    public void testQueryByIsAdmin()throws Exception{
        System.out.println(userService.queryByIsAdmin(0));
    }
}
