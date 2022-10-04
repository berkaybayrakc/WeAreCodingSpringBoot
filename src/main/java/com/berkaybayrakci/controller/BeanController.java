package com.berkaybayrakci.controller;

import com.berkaybayrakci.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired            // SpringFramework: Inject = SpringBoot: Autowired
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")  // URL
    @ResponseBody   // Display directly on screen without html
    public String getBeanDto() {

        return beanConfig.beanDto() + " ";   // (+ " ") statement converts to String
    }
}
