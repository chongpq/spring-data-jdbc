package com.example.loomdemo.service;

import com.example.loomdemo.domain.Product;
import com.example.loomdemo.web.ProductRequest;
import com.example.loomdemo.web.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
            product.id(),
            product.name().value(),
            product.price().amount()
        );
    }

    public Product toEntity(ProductRequest request) {
        return new Product(
            null,
            request.name(),
            request.price()
        );
    }
}
