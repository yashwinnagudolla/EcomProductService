package com.projects.EcomProductService.controller;

import com.projects.EcomProductService.dto.ProductListResponseDTO;
import com.projects.EcomProductService.dto.ProductRequestDTO;
import com.projects.EcomProductService.dto.ProductResponseDTO;
import com.projects.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("ProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity getAllProducts(){
        ProductListResponseDTO response = productService.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity getProductFromId(@PathVariable("id") int id){
        ProductResponseDTO response = productService.getProductById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/title/{title}")
    public ResponseEntity getProductFromTitle(@PathVariable("title") String title){
        ProductResponseDTO response = productService.getProductFromTitle(title);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/products")
    public ResponseEntity createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        ProductResponseDTO response = productService.createProduct(productRequestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id")int id){
        ProductResponseDTO response = productService.deleteProduct(id);
        return ResponseEntity.ok(response);
    }

}
