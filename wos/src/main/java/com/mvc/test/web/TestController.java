package com.mvc.test.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class TestController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        request.getParameter("name");
        return "test/test";
    }
}
