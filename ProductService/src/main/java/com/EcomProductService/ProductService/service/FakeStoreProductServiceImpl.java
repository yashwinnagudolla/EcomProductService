package com.EcomProductService.ProductService.service;

import com.EcomProductService.ProductService.dto.ProductListResponseDTO;
import com.EcomProductService.ProductService.dto.ProductRequestDTO;
import com.EcomProductService.ProductService.dto.ProductResponseDTO;
import org.springframework.stereotype.Service;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{
    @Override
    public ProductListResponseDTO getAllProducts() {
        return null;
    }

    @Override
    public ProductResponseDTO getProductById(int productId) {
        return null;
    }
    @Override
    public ProductResponseDTO getProductFromTitle(String title) {
        return null;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO product) {
        return null;
    }


    @Override
    public ProductResponseDTO updateProduct(int productId, ProductRequestDTO product) {
        return null;
    }

    @Override
    public void deleteProduct(int productId) {

    }


}
