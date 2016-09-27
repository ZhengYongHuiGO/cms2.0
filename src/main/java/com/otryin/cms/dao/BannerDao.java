package com.otryin.cms.dao;

import com.otryin.cms.entity.Banner;
import com.otryin.cms.entity.FilmBanner;

import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface BannerDao {
    List<Banner> getCrowFoundBannerList();
    List<Banner> getGoodsBannerList();
    List<FilmBanner> getFilmBannerList();
    Banner getBannerById(int id);
}
