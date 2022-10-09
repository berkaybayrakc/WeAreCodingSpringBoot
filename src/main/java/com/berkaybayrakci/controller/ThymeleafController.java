package com.berkaybayrakci.controller;

import com.berkaybayrakci.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //Option: root {}
    //http://localhost:8080
    @GetMapping({"/","index"})
    public String index() {
        return "index";
    }

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
    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    //@ResponseBody
    public String getThymeleaf4(Model model) {
        model.addAttribute("key_model1", "I came from Model-4.");
        return "thymeleaf_file/thymeleaf4";
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Submitting Model Object
    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    //@ResponseBody
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model1", "Text");

        ProductDto productDto= ProductDto
                        .builder()
                        .productId(0L)
                        .productName("Product Name")
                        .productPrice(2500)
                        .build();

        model.addAttribute("key_model2",productDto);

        return "thymeleaf5";
    }


    // Sending model object list
    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    //@ResponseBody
    public String getThymeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model1", "Text");
        List<ProductDto> myList = new ArrayList<>();
        myList.add(ProductDto.builder().productId(1L).productName("Product Name1").productPrice(1500).build());
        myList.add(ProductDto.builder().productId(2L).productName("Product Name2").productPrice(2500).build());
        myList.add(ProductDto.builder().productId(3L).productName("Product Name3").productPrice(3500).build());
        myList.add(ProductDto.builder().productId(4L).productName("Product Name4").productPrice(4500).build());

        model.addAttribute("product_list", myList);

        return "thymeleaf6";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Submitting Model Object
    //http://localhost:8080/thymeleaf7/4
    @GetMapping({"/thymeleaf7/{id}","/thymeleaf7"})
    //@ResponseBody
    public String getThymeleaf7ModelObject(Model model, @PathVariable(name = "id",required = false) Long id) {
        if(id!=null) {
            model.addAttribute("key_model1", "ID: " + id);
        }else {
            model.addAttribute("key_model1", "ID: Null");
        }


        return "thymeleaf7";
    }
}
