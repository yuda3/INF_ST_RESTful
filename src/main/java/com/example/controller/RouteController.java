package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
