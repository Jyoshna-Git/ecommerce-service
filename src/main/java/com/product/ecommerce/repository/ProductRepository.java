package com.product.ecommerce.repository;


import com.product.ecommerce.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Products, Long> {

}