package com.example.controller;

import com.example.entity.Product;
import com.example.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TemplateController {

    @Autowired
    private TemplateService service;

    @RequestMapping("/rest")
    public ResponseEntity<?> test(){
         return new ResponseEntity<>("Restful API Test", HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<?> products(){
        List<Product> list = service.products();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
