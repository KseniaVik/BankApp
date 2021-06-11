package com.example.bankapp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <UserEntity, Integer> {
}
