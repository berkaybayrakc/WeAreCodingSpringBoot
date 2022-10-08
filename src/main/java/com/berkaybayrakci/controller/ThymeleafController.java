package com.berkaybayrakci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    //@ResponseBody
    public String getThymeleaf2(Model model) {
        model.addAttribute("key_model1","I came from Model-1.");
        model.addAttribute("key_model2","I came from Model-2.");
        return "thymeleaf1";
    }
    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    //@ResponseBody
    public String getThymeleaf3(Model model) {
        model.addAttribute("key_model1", "I came from Model-1.");
        model.addAttribute("key_model2", "I came from Model-2.");
        return "thymeleaf_file/thymeleaf3";
    }
}