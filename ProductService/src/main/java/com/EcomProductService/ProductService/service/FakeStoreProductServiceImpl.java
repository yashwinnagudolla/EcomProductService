package com.EcomProductService.ProductService.service;

import com.EcomProductService.ProductService.client.FakeStoreAPIClient;
import com.EcomProductService.ProductService.dto.*;
import com.EcomProductService.ProductService.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{
    private FakeStoreAPIClient fakeStoreAPIClient;

    @Autowired
    public FakeStoreProductServiceImpl(FakeStoreAPIClient fakeStoreAPIClient) {
        this.fakeStoreAPIClient = fakeStoreAPIClient;
    }
    @Override
    public ProductListResponseDTO getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStorePorducts = fakeStoreAPIClient.getProducts();
        ProductListResponseDTO productListResponseDTO = new ProductListResponseDTO();
        for(FakeStoreProductResponseDTO response : fakeStorePorducts){
            productListResponseDTO.getProducts().add(ProductMapper.fakeProductResponseToProductResponse(response));
        }
        return productListResponseDTO;

    }

    @Override
    public ProductResponseDTO getProductById(int productId) {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreAPIClient.getProductById(productId);
        return ProductMapper.fakeProductResponseToProductResponse(fakeStoreProductResponseDTO);
    }
    @Override
    public ProductResponseDTO getProductFromTitle(String title) {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreAPIClient.getProductFromTitle(title);
        return ProductMapper.fakeProductResponseToProductResponse(fakeStoreProductResponseDTO);
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO product) {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO =
                fakeStoreAPIClient.createProduct(ProductMapper.productRequestToFakeStoreProductRequest(product));
        return ProductMapper.fakeProductResponseToProductResponse(fakeStoreProductResponseDTO);
    }


    @Override
    public ProductResponseDTO updateProduct(int productId, ProductRequestDTO product) {
        FakeStoreProductRequestDTO fakeStoreProductRequestDTO = ProductMapper.productRequestToFakeStoreProductRequest(product);
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreAPIClient.updateProduct(productId, fakeStoreProductRequestDTO);
        return ProductMapper.fakeProductResponseToProductResponse(fakeStoreProductResponseDTO);
    }

    @Override
    public void deleteProduct(int productId) {
        fakeStoreAPIClient.deleteProduct(productId);
    }


}
