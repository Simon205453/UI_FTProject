package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(Model dataToViewFromDB){
        return "index";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }
}
