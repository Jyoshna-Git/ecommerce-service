package com.product.ecommerce.service;

import java.util.List;


import com.product.ecommerce.entity.Products;
import com.product.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }


    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Products getProductById(Long Id) {
        return productRepository.findById(Id).orElseThrow(()-> new RuntimeException("Product Not found"));
    }

    public Products saveProduct(Products product) {
        return productRepository.save(product);
    }

    public Products UpdateProduct(Long id,Products products) {
        Products existingProduct = getProductById(id);
        existingProduct.setName(products.getName());
        existingProduct.setPrice(products.getPrice());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
