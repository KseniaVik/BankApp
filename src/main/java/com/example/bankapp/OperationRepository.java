package com.example.bankapp;

import org.springframework.data.repository.CrudRepository;

public interface OperationRepository extends CrudRepository<OperationEntity, Integer> {
}
