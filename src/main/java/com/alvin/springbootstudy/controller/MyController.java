package com.alvin.springbootstudy.controller;

import com.alvin.springbootstudy.listener.MyHttpSessionListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyController {
    @RequestMapping("hello")
    public String sayHello(HttpSession session) {
        session.setAttribute("login","login");
        return "Hello Spring Boot";
    }

    @RequestMapping("online")
    public String online(){
        return "Currently Online "+ MyHttpSessionListener.online +" Persons";
    }
}
