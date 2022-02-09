package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public String error(Exception e, Model model){
        e.printStackTrace();
        model.addAttribute("e", e);
        return "500";
    }

    @ExceptionHandler(IOException.class)
    public String error2(Exception e, Model model){
        e.printStackTrace();
        model.addAttribute("e", e);
        return "500";
    }
}
