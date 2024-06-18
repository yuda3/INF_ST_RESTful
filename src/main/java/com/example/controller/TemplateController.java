package com.example.controller;

import com.example.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TemplateController {

    @Autowired
    private TemplateService service;

    @RequestMapping("/rest")
    public String test(){
         return "Restful API Test";
    }
    // 추가적인 기능 구현

}
