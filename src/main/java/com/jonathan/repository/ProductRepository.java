package com.jonathan.repository;

import com.jonathan.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByIdentifier(String identifier);
}
