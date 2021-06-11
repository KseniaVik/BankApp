package com.example.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/users")
    public List<UserEntity> getUsers() {
        return userService.getListOfUsers();
    }

    @PostMapping(value = "/users")
    public void postUsers(@RequestBody UserEntity userEntity) {
        userService.addUser(userEntity);
    }

    @DeleteMapping(value = "/users/{userId}")
    public void deleteUsers(@PathVariable("userId") int id) {
        userService.deleteUser(id);
    }


}
