package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
