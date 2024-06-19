package com.example.repository;

import com.example.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateMapper {
    List<Product> products();
    void register(Product product);
    int deleteById(int product_number);
    Product getById(int product_number);
    void update(Product product);

}

