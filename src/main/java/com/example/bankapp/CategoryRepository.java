package com.example.bankapp;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository <CategoryEntity, Integer> {
}
