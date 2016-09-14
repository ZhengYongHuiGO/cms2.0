package com.otryin.cms.dao;

import com.otryin.cms.entity.Banner;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface BannerDao {
    List<Banner> getBannerList();
    Banner getBannerById(int id);
}
