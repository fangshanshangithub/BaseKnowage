package com.tourism.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/okpage")
    public String index() {
        return "ok";
    }
}
