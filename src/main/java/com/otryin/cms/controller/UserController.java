package com.otryin.cms.controller;

import com.otryin.cms.entity.User;
import com.otryin.cms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("getUserPage")
    public String getUserPage(Integer page,Integer pageSize,Model model){
        if(page==null){
            page=1;
        }
        if(pageSize==null){
            pageSize=20;
        }
        model.addAttribute("userPage",userService.getUserPage(page,pageSize));
        return "user-all";
    }
    @RequestMapping("getRecommendedUser")
    public String getRecommendedUser(Model model){
        List<User> userList=userService.getRecommendedUser();
        model.addAttribute("userList",userList);
        return "user-recommended";
    }
    @RequestMapping("userRegister")
    public String registerUser(Model model){
        return "user-register";
    }
}
