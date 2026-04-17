package com.example.loomdemo.web;

import com.example.loomdemo.service.ProductService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponse> getProducts() {
        logger.info("Handling GET on thread: {}", Thread.currentThread());
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductResponse addProduct(@Valid @RequestBody ProductRequest request) {
        logger.info("Handling POST on thread: {}", Thread.currentThread());
        return productService.createProduct(request);
    }
}
