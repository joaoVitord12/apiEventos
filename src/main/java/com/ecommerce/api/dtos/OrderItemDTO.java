package com.ecommerce.api.dtos;

import com.ecommerce.api.entities.OrderItemPK;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Long id;
    private Long productId; // id do produto

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 1, message = "A quantidade deve ser no mínimo 1")
    @Positive(message = "A quantidade deve ser positiva")
    private Integer quantity;

    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser positivo")
    private Double price;
}