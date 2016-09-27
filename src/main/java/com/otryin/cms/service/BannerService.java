package com.otryin.cms.service;

import com.otryin.cms.entity.Banner;
import com.otryin.cms.entity.FilmBanner;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19.
 */
public interface BannerService {
    List<Banner> getBannerList(int bannerType);
    Banner getBannerById();
    List<FilmBanner> getFilmBannerList();

}
