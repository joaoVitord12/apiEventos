package com.ecommerce.api.dtos;

import com.ecommerce.api.entities.OrderStatus;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;

    @NotNull(message = "Data de criação do pedido não pode ser vazio")
    @PastOrPresent(message = "Data de criação do pedido inválida")
    private LocalDateTime moment;

    @NotBlank(message = "Status do pedido não pode ser vazio")
    @Pattern(regexp = "WAITING_PAYMENT|PAID|SHIPPED|DELIVERED|CANCELLED", message = "Status inválido")
    private OrderStatus status;

    private UserDTO user;
    private PaymentDTO payment;

    @NotEmpty(message = "É obrigatório selecionar pelo menos um item")
    private List<OrderItemDTO> orderItems;
}
