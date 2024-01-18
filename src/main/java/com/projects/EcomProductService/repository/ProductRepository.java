package com.projects.EcomProductService.repository;

import com.projects.EcomProductService.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> findAll(){
        return new ArrayList<>();
    }
}
