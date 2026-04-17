package com.example.loomdemo.web;

import java.math.BigDecimal;

public record ProductResponse(Long id, String name, BigDecimal price) {
}
