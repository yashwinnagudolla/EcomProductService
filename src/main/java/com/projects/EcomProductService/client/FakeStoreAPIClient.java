package com.projects.EcomProductService.client;

import com.projects.EcomProductService.dto.FakeStoreProductRequestDTO;
import com.projects.EcomProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreAPIClient {
    private RestTemplateBuilder restTemplateBuilder;
    private String fakeStoreAPIURL;
    @Value("${fakestore.api.path.product}")
    private String fakeStoreAPIPathProduct;

    public FakeStoreAPIClient(RestTemplateBuilder restTemplateBuilder,@Value("${fakestore.api.url}") String fakeStoreAPIURL) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.fakeStoreAPIURL = fakeStoreAPIURL;
    }

    public List<FakeStoreProductResponseDTO> getAllProducts(){
        String url = fakeStoreAPIURL + fakeStoreAPIPathProduct;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> response = restTemplate.getForEntity(url,FakeStoreProductResponseDTO[].class);
        return List.of(response.getBody());
    }

    public FakeStoreProductResponseDTO getProductById(int id){
        String url = fakeStoreAPIURL + fakeStoreAPIPathProduct + "/"  + id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> response = restTemplate.getForEntity(url,FakeStoreProductResponseDTO.class);
        return response.getBody();
    }

    public FakeStoreProductResponseDTO createProduct(FakeStoreProductRequestDTO fakeStoreProductRequestDTO){
        String url = fakeStoreAPIURL + fakeStoreAPIPathProduct;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> response = restTemplate.postForEntity(url,fakeStoreProductRequestDTO,FakeStoreProductResponseDTO.class);
        return response.getBody();
    }

    public FakeStoreProductResponseDTO deleteProduct(int id){
        String url = fakeStoreAPIURL + fakeStoreAPIPathProduct + "/" + id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreProductResponseDTO response = getProductById(id);
        restTemplate.delete(url);
        return response;
    }

}
