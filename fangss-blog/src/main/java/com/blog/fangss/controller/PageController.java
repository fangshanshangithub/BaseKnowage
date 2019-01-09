package com.blog.fangss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页面跳转 controller
 */
@Controller
public class PageController {

    @RequestMapping(value = "/")
    public String index() {
       return "index";
    }



}
