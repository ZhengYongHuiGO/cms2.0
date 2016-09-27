package com.otryin.cms.service.impl;

import com.otryin.cms.common.Page;
import com.otryin.cms.dao.UserDao;
import com.otryin.cms.entity.User;
import com.otryin.cms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public Page<User> getUserPage(int page, int pageSize) {
        List<User> userList=userDao.getUserList((page-1)*pageSize,pageSize);
        int totalNum=userDao.getUserNum();
        Page<User> userPage=new Page<>((page-1)*pageSize,pageSize,totalNum,userList);
        return userPage;
    }

    @Override
    public List<User> getRecommendedUser() {
        return userDao.getRecommendedUser();
    }
}
