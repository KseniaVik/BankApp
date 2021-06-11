package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getListOfUsers(){
        return (List<UserEntity>) userRepository.findAll();
    }

    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

}
