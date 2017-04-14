package com.pandawork.service.impl;


import com.pandawork.common.entity.User;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.common.util.CommonUtil;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.UserMapper;
import com.pandawork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * userService的实现
 * Created by Taoyongpan on 2016/11/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    protected CommonDao commonDao;

    /**
     *用户增加
     * @param user
     * @throws SSException
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void newUser(User user)throws SSException
    {
        if(Assert.isNull(user))
        {
            return;
        }
        Assert.isNotNull(user.getUserName(), NFException.UnameNotNull);
        Assert.isNotNull(user.getPassWord(),NFException.UpwdNotNull);
        Assert.isNotNull(user.getPassWord1(),NFException.Upwd1NotNull);
        try{
//            if(userMapper.queryByName(user.getUsername())==null)
//            {
//                return;
//            }else if(user.getPassword()!=user.getPassword1()){
//                return;
//            }else{
                user.setPassWord(CommonUtil.md5(user.getPassWord()));
                user.setPassWord1(CommonUtil.md5(user.getPassWord1()));
                userMapper.newUser(user);
//            }
        }catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    /**
     * 根据ID删除用户
     * @param id
     * @throws SSException
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void DelUser(int id)throws SSException
    {
        if (Assert.isNull(id)){
            return;
        }
        try{
            userMapper.delById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.DelUserFailed,e);
        }
    }

    /**
     * 更新用户信息
     * @param user
     * @throws SSException
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void UpdateUser(User user)throws SSException
    {
        if(Assert.isNull(user))
        {
            return;
        }
        Assert.isNotNull(user.getUserName(), NFException.UnameNotNull);
        Assert.isNotNull(user.getPassWord(),NFException.UpwdNotNull);
        Assert.isNotNull(user.getPassWord1(),NFException.Upwd1NotNull);
        try{
            userMapper.update(user);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.UpdateUserFailed,e);
        }
    }

    /**
     * 根据ID查找用户
     * @param id
     * @throws SSException
     */
    @Override
    public void QueryById(int id)throws SSException
    {
        if (Assert.isNull(id)){
            return;
        }
        try{
            userMapper.queryById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.QueryUserById,e);
        }
    }

    /**
     * 根据用户名查找用户
     * @param username
     * @throws SSException
     */
    @Override
    public void QueryByName(String username) throws SSException {
        if(Assert.isNull(username)) {
            return;
        }try{
            userMapper.queryByName(username);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.QueryUserByName,e);
        }
    }

    /**
     * 列出所有用户
     * @return
     * @throws SSException
     */
    @Override
    public List<User> ListAll() throws SSException {
        try{
            return userMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListAll,e);
        }
    }

    /**
     * 对所有用户计数
     * @return
     * @throws SSException
     */
    @Override
    public int CountAll() throws SSException {
        try {
            return userMapper.countAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListAll,e);
        }
    }

    /**
     * 根据管理员等级查找
     * @param isadmin
     * @return
     * @throws SSException
     */
    @Override
    public List<User> queryByIsAdmin(int isadmin)throws SSException{
        try{
            return userMapper.queryByIsAdmin(isadmin);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.QueryUserByNameFailed,e);
        }
    }

}
