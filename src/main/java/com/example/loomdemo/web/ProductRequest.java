package com.example.loomdemo.web;

import com.example.loomdemo.domain.Price;
import com.example.loomdemo.domain.ProductName;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record ProductRequest(
    @NotNull(message = "Product name is required")
    @Valid
    ProductName name,

    @NotNull(message = "Price is required")
    @Valid
    Price price
) {
}
