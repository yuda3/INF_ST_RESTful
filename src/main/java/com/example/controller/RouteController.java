package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RouteController {

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

}
