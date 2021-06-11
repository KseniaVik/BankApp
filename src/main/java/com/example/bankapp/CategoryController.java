package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/category")
    public List<CategoryEntity> getCategories () {
        return categoryService.getListOfCategories();
    }

    @PostMapping(value = "/category")
    public void postCategories (@RequestBody CategoryEntity categoryEntity){
        categoryService.addNewCategory(categoryEntity);
    }

    @DeleteMapping(value = "/category/{categoryId}")
    public void deleteCategories(@PathVariable("categoryId") int id){
        categoryService.deleteCategory(id);

    }


}
