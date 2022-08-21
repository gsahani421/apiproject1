package com.govind.apiproject1.repository;

import com.govind.apiproject1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    Product findByType(String type);

    Product findByCategory(String category);

    Product findByPrice(Double price);
}
