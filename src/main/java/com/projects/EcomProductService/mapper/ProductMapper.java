package com.projects.EcomProductService.mapper;

import com.projects.EcomProductService.dto.ProductListResponseDTO;
import com.projects.EcomProductService.dto.ProductResponseDTO;
import com.projects.EcomProductService.model.Product;

import java.util.List;

public class ProductMapper {

    public static ProductResponseDTO productToProductResponseDto(Product product){
        ProductResponseDTO response = new ProductResponseDTO();
        response.setCategory(product.getCategory().getCategoryName());
        response.setDescription(product.getDescription());
        response.setTitle(product.getTitle());
        response.setPrice(product.getPrice().getAmount());
        response.setImage(product.getImage());
        return response;
    }

    public static ProductListResponseDTO productsToProductListResponseDTO(List<Product> products){
        ProductListResponseDTO response = new ProductListResponseDTO();
        for(Product p : products){
            response.getProducts().add(ProductMapper.productToProductResponseDto(p));
        }
        return response;
    }
}
