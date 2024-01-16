package com.projects.EcomProductService.dto;

import com.projects.EcomProductService.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductListResponseDTO {
    private List<ProductResponseDTO> products;

    public ProductListResponseDTO() {
        this.products = new ArrayList<>();
    }
}
