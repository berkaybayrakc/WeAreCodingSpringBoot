package com.berkaybayrakci.controller;

import com.berkaybayrakci.dto.TeacherDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Log4j2
public class FormController {

    // FORM //
//    @GetMapping
//    @PostMapping
//    @PutMapping
//    @DeleteMapping


    //@GetMethod
    //http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("cv_teacher",new TeacherDto());
        return "form_post/formvalidation";
    }

    //PostMethod
    //http://localhost:8080/form
    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_teacher") TeacherDto teacherDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("Error...");
            System.err.println("Error...");
            return "form_post/formvalidation";
        }
        log.info("Success !" + teacherDto);

        // Database Operation : JDBC,PreparedStatement
        // FileWriter: IO, FileWriter
        // SAVE DATA TO BOTH DATABASE AND FİLE

        return "form_post/success";
    }
}
