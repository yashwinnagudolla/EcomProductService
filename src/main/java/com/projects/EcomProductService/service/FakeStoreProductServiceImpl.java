package com.projects.EcomProductService.service;

import com.projects.EcomProductService.client.FakeStoreAPIClient;
import com.projects.EcomProductService.dto.ProductListResponseDTO;
import com.projects.EcomProductService.dto.ProductRequestDTO;
import com.projects.EcomProductService.dto.ProductResponseDTO;
import com.projects.EcomProductService.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service("FakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;
    private FakeStoreAPIClient fakeStoreAPIClient;
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder, FakeStoreAPIClient fakeStoreAPIClient) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.fakeStoreAPIClient = fakeStoreAPIClient;
    }
//    ProductResponseDTO getProductById(int id);
//    ProductResponseDTO getProductFromTitle(String title);
//    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
//    ProductResponseDTO deleteProduct(int id);
//    Product updateProduct(int id, Product product);

    public ProductListResponseDTO getAllProducts(){
        //make a call to the service
        //the call is get call
        //then convert the objects using mapper and return the productListResponsedto

    }
}
