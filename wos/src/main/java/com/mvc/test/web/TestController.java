package com.mvc.test.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.test.model.User;

@Controller
@RequestMapping("/public")
public class TestController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        request.getParameter("name");
        return "test/test";
    }
    
    @RequestMapping("/test1")
    @ResponseBody
    public User test1(HttpServletRequest request){
        User user = new User();
        user.setName("薛少飞");
        user.setAge(30);
        user.setGender("男");
        return user;
    }
    @RequestMapping("/test2")
    public String test2(HttpServletRequest request){
        request.getParameter("name");
        return "jsonView";
    }
    
    @RequestMapping("/test3")
    public String test3(HttpServletRequest request,ModelMap map){
        map.addAttribute("result","true");
        User user = new User();
        user.setName("薛少飞");
        user.setAge(30);
        user.setGender("男");
        map.addAttribute("user",user);
        return "jsonView";
    }
}
