package com.EcomProductService.ProductService.controller;

import com.EcomProductService.ProductService.dto.ProductListResponseDTO;
import com.EcomProductService.ProductService.dto.ProductRequestDTO;
import com.EcomProductService.ProductService.dto.ProductResponseDTO;
import com.EcomProductService.ProductService.model.Product;
import com.EcomProductService.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity getAllProducts() {
        ProductListResponseDTO response =  productService.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity getProductById(@PathVariable("productId") int productId) {
        ProductResponseDTO response =  productService.getProductById(productId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/title/{title}")
    public ResponseEntity getProductFromTitle(@PathVariable("title") String title){
        ProductResponseDTO response =  productService.getProductFromTitle(title);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity createProduct(ProductRequestDTO product){
        ProductResponseDTO response = productService.createProduct(product);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity deleteProductById(int productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok().build();

    }







}
