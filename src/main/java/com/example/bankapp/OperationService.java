package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {

    @Autowired
    OperationRepository operationRepository;

    public List<OperationEntity> getListOfOperations(){
        return (List<OperationEntity>) operationRepository.findAll();
    }

    public void addNewOperation(OperationEntity operationEntity){
        operationRepository.save(operationEntity);
    }

    public void deleteAnyOperation(int id) {
        operationRepository.deleteById(id);
    }

}
