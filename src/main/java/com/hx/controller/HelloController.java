package com.hx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yxqiang
 * @create 2018-09-18 22:47
 */

@Controller
public class HelloController {

    @ResponseBody //表示要将请求返回
    @RequestMapping("/hello") //表示路由请求地址
    public String Hello(){
        return "Hello World!";
    }
}
