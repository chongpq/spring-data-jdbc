package com.example.loomdemo.web;

import com.example.loomdemo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponse> getProducts() {
        System.out.println("Handling GET on thread: " + Thread.currentThread());
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductResponse addProduct(@Valid @RequestBody ProductRequest request) {
        System.out.println("Handling POST on thread: " + Thread.currentThread());
        return productService.createProduct(request);
    }
}
