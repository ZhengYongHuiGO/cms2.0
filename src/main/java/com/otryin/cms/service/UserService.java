package com.otryin.cms.service;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface UserService {
    Page<User> getUserPage(int page,int pageSize);
    List<User> getRecommendedUser();
}
