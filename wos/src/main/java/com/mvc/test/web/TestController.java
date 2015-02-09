package com.mvc.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test/test";
    }
}
