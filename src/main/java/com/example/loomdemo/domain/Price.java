package com.example.loomdemo.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;

public record Price(@JsonValue BigDecimal amount) {
    public Price {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cannot be negative or null");
        }
    }
}
