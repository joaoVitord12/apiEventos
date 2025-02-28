package com.ecommerce.api.dtos;

import com.ecommerce.api.entities.Order;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PaymentDTO {
    private Long id;

    @NotNull(message = "Data de pagamento não pode ser vazio")
    private LocalDateTime moment;

    private List<Order> orders;
}
