package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperationController {

    @Autowired
    OperationService operationService;

    @GetMapping(value = "/operation")
    public List<OperationEntity> getOperations(){
      return operationService.getListOfOperations();
    }

    @PostMapping(value = "/operation")
    public void postOperation(@RequestBody OperationEntity operationEntity){
        operationService.addNewOperation(operationEntity);

    }

    @DeleteMapping(value = "/operation/{operationId}")
    public void deleteOperation (@PathVariable("operationId") int id) {
        operationService.deleteAnyOperation(id);
    }



}
