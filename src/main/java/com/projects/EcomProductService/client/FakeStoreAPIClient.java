package com.projects.EcomProductService.client;

import com.projects.EcomProductService.dto.FakeStoreProductRequestDTO;
import com.projects.EcomProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class FakeStoreAPIClient {
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreAPIClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

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
