package com.example.controller;

import com.example.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @Autowired
    private TemplateService service;

    @GetMapping("/template")
    public String index() {
        return "template";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }

}
