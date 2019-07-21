package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/")
   public String welcome(ModelMap modelMap){
        modelMap.addAttribute("tagline","WelcomeMVC");
        return "Welcome";
    }
}
