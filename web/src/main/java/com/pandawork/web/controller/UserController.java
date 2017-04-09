package com.pandawork.web.controller;

import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Taoyongpan on 2016/11/7.
 */
@Controller
@RequestMapping("user")
public class UserController extends AbstractController {

    /**
     *列出用户的Controller
     * @param model
     * @return
     */
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public String userList(Model model,HttpServletRequest request)
//    {
//        try{
//            List<User> list= Collections.emptyList();
//            String uname = (String)request.getSession().getAttribute("uname");
//            User user =userService.queryByName(uname);
//            if(user.getIsadmin()==2){
//                list = userService.listAll();
//            }else if(user.getIsadmin()==1){
//                list = userService.queryByIsAdmin(0);
//            }
//            model.addAttribute("list",list);
//            return "userList";
//        }catch (SSException e)
//        {
//            LogClerk.errLog.error(e);
//            sendErrMsg(e.getMessage());
//            return ADMIN_SYS_ERR_PAGE;
//        }
//    }



}

