package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/index")
//    public String get(){
//        System.out.println("im controller");
//        if(true) throw new RuntimeException("im exception");
//        return "index";
//    }
    @RequestMapping(value = "/data", produces = "application/json")
    @ResponseBody
    public User home(){
        User user =new User();
        user.setUsername("levis");
        user.setAge(18);
//        user.setPassword("123456");
        return user;
    }

    @RequestMapping(value = "/index")
    public String get(){
        return "index";
    }


    @RequestMapping("/submit")
    @ResponseBody
    public String submit(@RequestBody User user){
        System.out.println("foward data："+ user);
        return "{\"success\": true}";
    }
}
