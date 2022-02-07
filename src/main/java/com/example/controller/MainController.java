package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping( value = "/index",params = "username!=test", method = {RequestMethod.POST, RequestMethod.GET}) // * ,? , **
    //@PostMapping("/index")
//    @GetMapping("/index")
    public String index(@RequestParam("username") String username) { //not only Model，  Map、ModelMap
        //model.addAttribute("name","啊 !");
        System.out.println("UserName" + username);
        return "index";
    }

}
