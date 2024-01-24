package com.projects.EcomProductService.client;

import com.projects.EcomProductService.dto.FakeStoreProductRequestDTO;
import com.projects.EcomProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.util.List;

public class FakeStoreAPIClient {
    private RestTemplateBuilder restTemplateBuilder;

    public List<FakeStoreProductResponseDTO> getAllProducts(){
        return null;
    }

    public FakeStoreProductResponseDTO getProductById(int id){
        return null;
    }

    public FakeStoreProductResponseDTO createProduct(FakeStoreProductRequestDTO fakeStoreProductRequestDTO){
        return null;
    }

    public FakeStoreProductResponseDTO deleteProduct(int id){
        return null;
    }

}
