package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping( "/yyds")

public class MainController {

//    http://localhost:8080/mvc/index
//    @RequestMapping(value = "/index")
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.getModel().put("name", "啊");
//        return modelAndView;
//    }

    //    @RequestMapping( value = "/index",params = "username!=test", method = {RequestMethod.POST, RequestMethod.GET}) // * ,? , **
    //@PostMapping("/index")
//    @GetMapping("/index")
//    public String index(User user) {//http://localhost:8080/mvc/index?username=user1&password=123456
//        //model.addAttribute("name","啊 !");
//        System.out.println("request param：" + user);
//        return "index";
//    }
//    @RequestMapping(value = "/index")
//    public ModelAndView index(HttpServletResponse response,
//                              @CookieValue(value = "test", required = false) String test) {
//        System.out.println("cookie value：" + test);
//        response.addCookie(new Cookie("test", "lbwnb"));
//        return new ModelAndView("index");
//    }

//    @RequestMapping(value = "/index")
//    public ModelAndView index(@SessionAttribute(value = "test", required = false) String test,
//                              HttpSession session){
//        session.setAttribute("test", "xxxx1111");
//        System.out.println(test);
//        return new ModelAndView("index");
//    }

    @RequestMapping("/index")
    public String index(){
        return "forward:home";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
