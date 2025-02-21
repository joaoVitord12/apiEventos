package com.ecommerce.api.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

    @Data
    public class ProductDTO {
        private Long id;

        @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
        @NotBlank(message = "Nome não pode ser vazio")
        private String name;

        @Size(max = 300, message = "Descrição deve ter no máximo 300 caracteres")
        private String description;

        @NotNull(message = "Preço não pode ser vazio")
        @Positive(message = "Preço deve ser positivo")
        private Double price;

        private String image;

        @NotEmpty(message = "É obrigatório selecionar pelo menos uma categoria")
        private List<CategoryDTO> categories = new ArrayList<>();

    }

