package com.otryin.cms.dao;

import com.otryin.cms.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface UserDao {
    User getUserById(int id);
    List<User> getUserList(int offset,int limit);


}
