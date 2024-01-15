package com.projects.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Order extends BaseModel{
    private double price;
    @ManyToMany
    private List<Product> products;
}
