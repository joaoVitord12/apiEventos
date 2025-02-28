package com.ecommerce.api.service;

import com.ecommerce.api.dtos.CategoryDTO;
import com.ecommerce.api.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(category
                -> new CategoryDTO(category.getId(), category.getName())).toList();
    }

}