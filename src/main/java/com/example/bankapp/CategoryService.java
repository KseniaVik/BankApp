package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<CategoryEntity> getListOfCategories(){
        return (List<CategoryEntity>) categoryRepository.findAll();
    }

    public void addNewCategory (CategoryEntity categoryEntity) {
        categoryRepository.save(categoryEntity);
    }

    public void deleteCategory (int id) {
        categoryRepository.deleteById(id);
    }

}
