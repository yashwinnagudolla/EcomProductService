package com.EcomProductService.ProductService.repository;

import com.EcomProductService.ProductService.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID>{
    Category findByCategoryName(String categoryName);
    Category findByCategoryNameAndDescription(String categoryName, String description);
    Category findByCategoryNameOrDescription(String categoryName, String description);

}
