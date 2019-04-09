package com.uu.gmall00.gmall.user.service.impl;

import com.uu.gmall00.gmall.user.bean.UserInfo;
import com.uu.gmall00.gmall.user.mapper.UserInfoMapper;
import com.uu.gmall00.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        //Selective 选择性的
        userInfoMapper.insertSelective(userInfo);
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }
}
