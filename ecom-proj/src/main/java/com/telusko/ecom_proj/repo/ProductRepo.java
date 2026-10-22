package com.telusko.ecom_proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.ecom_proj.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
