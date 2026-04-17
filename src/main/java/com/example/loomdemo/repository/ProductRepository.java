package com.example.loomdemo.repository;

import com.example.loomdemo.domain.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Long> {
}
