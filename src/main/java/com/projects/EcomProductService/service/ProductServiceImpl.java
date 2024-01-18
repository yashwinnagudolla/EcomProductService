package com.projects.EcomProductService.service;

import com.projects.EcomProductService.dto.ProductListResponseDTO;
import com.projects.EcomProductService.dto.ProductRequestDTO;
import com.projects.EcomProductService.dto.ProductResponseDTO;
import com.projects.EcomProductService.mapper.ProductMapper;
import com.projects.EcomProductService.model.Product;
import com.projects.EcomProductService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }


//    ProductListResponseDTO getAllProducts();
//    ProductResponseDTO getProductById(int id) throws ProductNotFoundException;
//    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
//    boolean deleteProduct(int id);
//    Product updateProduct(int id, Product updatedProduct);
//    ProductResponseDTO findProductByTitle(String title) throws ProductNotFoundException;


    public ProductListResponseDTO getAllProducts(){
        List<Product> products  = productRepository.findAll();
        return ProductMapper.productsToProductListResponseDTO(products);
    }

    public ProductResponseDTO getProductById(int id){
        return null;
    }

    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO){
        return null;
    }

    public ProductResponseDTO deleteProduct(int id){
        return null;
    }

    public Product updateProduct(int id, Product updatedProduct){
        return null;
    }

    public ProductResponseDTO getProductFromTitle(String title){
        Product product = productRepository.findByTitle(title);
        return ProductMapper.productToProductResponseDto(product);

    }




}
