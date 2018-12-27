/*
 * @author Fang ShanShan (fangshanshan@artron.net)
 *
 * CreatAt: 2018/12/18 Time: 下午3:17
 *
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 *
 * Use of this source code is governed a license that can be found in the LICENSE file.
 *
 */

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
