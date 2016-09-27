package com.otryin.cms.dao;

import com.otryin.cms.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface UserDao {
    User getUserById(int id);
    List<User> getUserList(@Param("offset") int offset,@Param("limit") int limit);
    int getUserNum();
    List<User> getRecommendedUser();
}
