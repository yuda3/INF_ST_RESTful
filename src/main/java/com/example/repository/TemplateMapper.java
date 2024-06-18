package com.example.repository;

import com.example.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateMapper {
    List<Product> products();

}

