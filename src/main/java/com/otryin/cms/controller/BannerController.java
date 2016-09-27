package com.otryin.cms.controller;

import com.otryin.cms.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/19.
 */
@Controller
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("getGoodsBanners")
    public String getGoodsBanners(Model model){
        model.addAttribute("goodsBanners",bannerService.getBannerList(1));
        return "goods-banner";
    }
    @RequestMapping("getCfBanners")
    public String getCfBanners(Model model){
        model.addAttribute("cfBanners",bannerService.getBannerList(0));
        return "crowfound-banner";
    }
    @RequestMapping("getFilmBanners")
    public String getFilmBanners(Model model){
        model.addAttribute("filmBanners",bannerService.getFilmBannerList());
        return "film-banner";
    }
}
