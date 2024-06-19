package com.example.controller;

import com.example.entity.Product;
import com.example.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TemplateController {

    @Autowired
    private TemplateService service;

    @RequestMapping("/rest")
    public ResponseEntity<String> test(){
         return new ResponseEntity<>("Restful API Test", HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> products(){
        List<Product> list = service.products();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    //Post : https://localhost:8081/REST/api/products
    @PostMapping("/products")
    public ResponseEntity<String> register(@RequestBody Product product){
        service.register(product);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    //Delete : https://localhost:8081/REST/api/products/{id}
    @DeleteMapping("products/{product_number}")
    public ResponseEntity<Integer> deleteById(@PathVariable int product_number){
        int cnt = service.deleteById(product_number);
        return new ResponseEntity<>(cnt,HttpStatus.OK);
    }

    //Get : https://localhost:8081/REST/api/products/{id}
    @GetMapping("products/{product_number}")
    public ResponseEntity<Product> getById(@PathVariable int product_number){
        Product product= service.getById(product_number);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    //Put : https://localhost:8081/REST/api/products/{id} : {product_number, product_name, inventory, price}
    @PutMapping("products/{product_number}")
    public ResponseEntity<String> putById(@PathVariable int product_number, @RequestBody Product product){
        service.update(product);
        return new ResponseEntity<>("success",HttpStatus.OK);
    }
}
