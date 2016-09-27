package com.otryin.cms.controller;

import com.otryin.cms.constant.ConstantSaveImageUrl;
import com.otryin.cms.constant.ImageName;
import com.otryin.cms.entity.Film;
import com.otryin.cms.service.FilmService;
import com.otryin.cms.utils.UploadFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



/**
 * Created by Administrator on 2016/9/22.
 */
@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @RequestMapping("filmPage")
    public String filmPage(Integer page,Integer pageSize,Model model){
        if(page==null){
            page=1;
        }
        if(pageSize==null){
            pageSize=20;
        }
        model.addAttribute("filmPage",filmService.getPageFilm(page,pageSize));
        return "film-all";
    }
    @RequestMapping(value="addFilm",method = RequestMethod.POST)
    public String addFilm(Film film, Integer filmId, @RequestParam("poster") MultipartFile poster, @RequestParam("logo") MultipartFile logo){
        System.out.println("----------------------------------------");
        if(!poster.isEmpty()){
            String fileName= ImageName.getImageName();
            String posterUrl= ConstantSaveImageUrl.getCopyurl()+"film/poster/"+fileName ;
            if(UploadFile.saveFile(poster,posterUrl)){
                film.setPosterUrl(ConstantSaveImageUrl.getSaveimageip()+"film/poster/"+fileName);
            }
            else{
                logger.error("保存海报失败");
            }

        }
        if(!logo.isEmpty()){
            String fileName=ImageName.getImageName();
            String logoUrl=ConstantSaveImageUrl.getCopyurl()+"film/logo/"+fileName;
            if(UploadFile.saveFile(logo,logoUrl)){
                film.setLogoUrl(ConstantSaveImageUrl.getSaveimageip()+"film/logo/"+fileName);
            }
            else {
                logger.error("复制logo文件时出错啦");
            }

        }
        filmService.saveFilm(film);
        return "film-add";
    }
}
