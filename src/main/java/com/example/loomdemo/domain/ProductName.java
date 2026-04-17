package com.example.loomdemo.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public record ProductName(@JsonValue String value) {
    public ProductName {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty or null");
        }
    }
}
