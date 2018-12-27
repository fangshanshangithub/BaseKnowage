package com.base.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转 controller
 */
@Controller
public class PagesController {

    /**
     * 主页
     * @return
     */
    @RequestMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    /**
     * io 模块主页
     * @return
     */
    @RequestMapping(value = "io")
    public String ioPage() {
        return "io";
    }

}
