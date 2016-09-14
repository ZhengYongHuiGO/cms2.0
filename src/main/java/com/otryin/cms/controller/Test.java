package com.otryin.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/9/13.
 */
@Controller
public class Test {
    @RequestMapping("test")
    public String test(){
        return "index";
    }
}
