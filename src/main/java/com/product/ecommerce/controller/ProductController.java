package com.product.ecommerce.controller;

import java.util.List;


import com.product.ecommerce.entity.Products;
import com.product.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService=productService;
    }

    @GetMapping
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable Long id,@RequestBody Products product) {
        return productService.UpdateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok("User Deleted Successfully");
    }
}
