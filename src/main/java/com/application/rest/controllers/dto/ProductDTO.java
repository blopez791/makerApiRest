package com.application.rest.controllers.dto;

import com.application.rest.entities.Maker;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private BigDecimal price;
    private Maker maker;
}
