package com.projects.EcomProductService.service;

import com.projects.EcomProductService.dto.ProductListResponseDTO;
import com.projects.EcomProductService.dto.ProductRequestDTO;
import com.projects.EcomProductService.dto.ProductResponseDTO;
import com.projects.EcomProductService.model.Product;

public interface ProductService {
    ProductListResponseDTO getAllProducts();
    ProductResponseDTO getProductById(int id);
    ProductResponseDTO getProductFromTitle(String title);
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    ProductResponseDTO deleteProduct(int id);

    Product updateProduct(int id, Product product);
}
