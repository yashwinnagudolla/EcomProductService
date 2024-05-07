package com.EcomProductService.ProductService.client;

import com.EcomProductService.ProductService.dto.FakeStoreProductRequestDTO;
import com.EcomProductService.ProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreAPIClient {
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakeStore.api.url}")
    private String fakeStoreAPIURL;
    @Value("${fakeStore.api.path.product}")
    private String fakeStoreAPIPathProduct;

    public FakeStoreAPIClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public List<FakeStoreProductResponseDTO> getProducts() {
        String getAllProductsURL = fakeStoreAPIURL + fakeStoreAPIPathProduct;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> response =
                restTemplate.getForEntity(getAllProductsURL, FakeStoreProductResponseDTO[].class);
        return List.of(response.getBody());
    }

    public FakeStoreProductResponseDTO getProductById(int productId){
        String getProductByIdURL = fakeStoreAPIURL + fakeStoreAPIPathProduct + "/" + productId;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> response = restTemplate.getForEntity(getProductByIdURL, FakeStoreProductResponseDTO.class);
        return response.getBody();
    }

    public FakeStoreProductResponseDTO createProduct(FakeStoreProductRequestDTO product){
        String createProductURL = fakeStoreAPIURL + fakeStoreAPIPathProduct;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> response = restTemplate.getForEntity(createProductURL, FakeStoreProductResponseDTO.class);
        return response.getBody();
    }

    public FakeStoreProductResponseDTO updateProduct(int productId, FakeStoreProductRequestDTO product){
        String updateProductURL = fakeStoreAPIURL + fakeStoreAPIPathProduct + "/" + productId;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> response = restTemplate.getForEntity(updateProductURL, FakeStoreProductResponseDTO.class);
        return response.getBody();
    }

    public void deleteProduct(int productID){
        String deleteProductURL = fakeStoreAPIURL + fakeStoreAPIPathProduct + "/" + productID;
        RestTemplate restTemplate = restTemplateBuilder.build();
        restTemplate.delete(deleteProductURL);
    }

    public List<FakeStoreProductResponseDTO> getProductsBYLimit(int limit){
        String getProductsByLimitURL = fakeStoreAPIURL + fakeStoreAPIPathProduct + "?limit=" + limit;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> response = restTemplate.getForEntity(getProductsByLimitURL, FakeStoreProductResponseDTO[].class);
        return List.of(response.getBody());
    }


}
