package com.uu.gmall00.gmall.user.controller;

import com.uu.gmall00.gmall.user.bean.UserInfo;
import com.uu.gmall00.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class UserInfoController {
    @Autowired
    private UserService userService;


    @RequestMapping("listAll")
    @ResponseBody
    public List<UserInfo> getUserInfoListAll(){
        List<UserInfo> userInfoList = userService.getUserInfoListAll();
        return userInfoList;
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(){
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail("33333@qq.com");
        userInfo.setHeadImg("1号头信息");
        userInfo.setLoginName("00003");
        userInfo.setName("张三3");
        userInfo.setPasswd("00003");
        userInfo.setNickName("NickName3");
        userInfo.setPhoneNum("33333333333");
        userInfo.setUserLevel("三");
        userService.addUser(userInfo);
        return "OK";
    }
    
    @RequestMapping("delete")
    @ResponseBody
    public void delete(){}
}
