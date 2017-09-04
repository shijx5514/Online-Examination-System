package com.jlu.examination.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Controller("/login")
public class LoginController {
    @RequestMapping("/test")
    public void test(){
        System.out.print("haha");
    }
}
