package com.ecommerce.api.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

    @Data
    @Entity
    @Table(name = "tb_order_items")
    public class OrderItem {
        @EmbeddedId
        private OrderItemPK id = new OrderItemPK();

        private Integer quantity;
        private Double price;
    }

