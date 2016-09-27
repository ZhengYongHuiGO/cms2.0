package com.otryin.cms.controller;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.CrowFound;
import com.otryin.cms.service.CrowFoundService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/14.
 */
@Controller
public class CrowFoundController {
    @Resource
    private CrowFoundService crowFoundService;
    @RequestMapping("crowFoundsPage")
    public String crowFoundsPage(Integer page,Integer pageSize,Model model){
        if(page==null){
            page=1;
        }
        if(pageSize==null){
            pageSize=20;
        }
        model.addAttribute("crowFounds",crowFoundService.getCrowFoundPage(page,pageSize));
        return "crowfound-all";
    }
}
