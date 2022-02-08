package com.example.controller;

import com.example.entity.TestBean;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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

    //RestFul
    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") String text){
        System.out.println("get user："+text);
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String post(String username){
        System.out.println("add user："+username);
        return "index";
    }

    @RequestMapping(value = "/index/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") String text){
        System.out.println("delete user："+text);
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.PUT)
    public String put(String username){
        System.out.println("modify user："+username);
        return "index";
    }
}
