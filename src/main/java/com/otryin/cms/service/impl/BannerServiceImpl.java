package com.otryin.cms.service.impl;

import com.otryin.cms.dao.BannerDao;
import com.otryin.cms.entity.Banner;
import com.otryin.cms.entity.FilmBanner;
import com.otryin.cms.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19.
 */
@Service("bannerService")
public class BannerServiceImpl  implements BannerService {
    @Autowired
    private BannerDao bannerDao;
    public List<Banner> getBannerList(int bannerType) {
        List<Banner> bannerList;
        if(bannerType==0){
            bannerList=bannerDao.getCrowFoundBannerList();

        }
        else{
            bannerList=bannerDao.getGoodsBannerList();
        }
        return bannerList;
    }

    public Banner getBannerById() {
        return null;
    }

    public List<FilmBanner> getFilmBannerList() {
        return bannerDao.getFilmBannerList();
    }
}
