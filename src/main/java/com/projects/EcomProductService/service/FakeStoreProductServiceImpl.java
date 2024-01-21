package com.projects.EcomProductService.service;

import com.projects.EcomProductService.client.FakeStoreAPIClient;
import com.projects.EcomProductService.dto.*;
import com.projects.EcomProductService.mapper.ProductMapper;
import com.projects.EcomProductService.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<FakeStoreProductResponseDTO> response = fakeStoreAPIClient.getAllProducts();
        ProductListResponseDTO products = new ProductListResponseDTO();
        for(FakeStoreProductResponseDTO fakeStoreProductResponseDTO: response){
            products.getProducts().add(ProductMapper.fakeStoreProductResponseDTOtoProductResponseDTO(fakeStoreProductResponseDTO));
        }
        return products;
    }

    public ProductResponseDTO getProductById(ProductRequestDTO productRequestDTO){
        FakeStoreProductRequestDTO request = ProductMapper.
        FakeStoreProductResponseDTO response = fakeStoreAPIClient.getProductById()
    }
}
