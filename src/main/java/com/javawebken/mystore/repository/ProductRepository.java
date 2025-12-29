package com.javawebken.mystore.repository;

import com.javawebken.mystore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
