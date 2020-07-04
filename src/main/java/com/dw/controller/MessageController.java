package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageController {

    //跳转到测试页面
    @RequestMapping("/toTestPage")
    public String toTestPage(){
        return "test";
    }

}
