package com.example.loomdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;

public record Product(
    @Id Long id,
    @Embedded(onEmpty = Embedded.OnEmpty.USE_NULL, prefix = "") ProductName name,
    @Embedded(onEmpty = Embedded.OnEmpty.USE_NULL, prefix = "") Price price
) {
}
