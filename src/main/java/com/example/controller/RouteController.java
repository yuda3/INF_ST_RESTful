package com.example.controller;

import com.example.entity.Product;
import com.example.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RouteController {
    @Autowired
    TemplateService service;

    @GetMapping("/template")
    public String index() {
        return "template";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/detail/{product_number}")
    public String detail(@PathVariable int product_number, Model model){
        model.addAttribute("product_number",product_number);
        return "detail";
    }

    @GetMapping("/update/{product_number}")
    public String update(@PathVariable int product_number, Model model){
        Product product = service.getById(product_number);
        model.addAttribute("product", product);
        return "update";
    }

}
