package com.maikang.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
//@Component
public class HelloController  {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("hhhello mvc");
        return "success";
    }


    @ModelAttribute
    public void showUser() {
        System.out.println("inside showUser......");
    }
}
