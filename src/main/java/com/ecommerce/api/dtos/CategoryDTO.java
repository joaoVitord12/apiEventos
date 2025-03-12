package com.ecommerce.api.dtos;

import com.ecommerce.api.entities.Product;
import lombok.Data;

import java.util.List;
import java.util.Set;


@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private List<ProductDTO> products;

    public CategoryDTO(Long id, String name) {
    }
    public void setProducts(Set<Product> products) {
        this.products = products.stream().map(
                product ->
                        new ProductDTO(product.getId(),
                                product.getName(),
                                product.getDescription(),
                                product.getPrice(),
                                product.getImgUrl(),
                                product.getCategories())).toList();
    }
}