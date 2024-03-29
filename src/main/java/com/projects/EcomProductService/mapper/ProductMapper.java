package com.projects.EcomProductService.mapper;

import com.projects.EcomProductService.dto.*;
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

    public static ProductResponseDTO fakeStoreProductResponseDTOtoProductResponseDTO(FakeStoreProductResponseDTO fakeStoreProductResponseDTO){
        ProductResponseDTO response = new ProductResponseDTO();
        response.setId(fakeStoreProductResponseDTO.getId());
        response.setCategory(fakeStoreProductResponseDTO.getCategory());
        response.setDescription(fakeStoreProductResponseDTO.getDescription());
        response.setPrice(fakeStoreProductResponseDTO.getPrice());
        response.setTitle(fakeStoreProductResponseDTO.getTitle());
        response.setImage(fakeStoreProductResponseDTO.getImage());
        return response;
    }
    public static FakeStoreProductRequestDTO productRequestDTOtoFakeStoreProductRequestDto(ProductRequestDTO productRequestDTO){
        FakeStoreProductRequestDTO response = new FakeStoreProductRequestDTO();
        response.setCategory(productRequestDTO.getCategory());
        response.setDescription(productRequestDTO.getDescription());
        response.setTitle(productRequestDTO.getTitle());
        response.setImage(productRequestDTO.getImage());
        response.setPrice(productRequestDTO.getPrice());
        return response;
    }
}
