package com.LensCart.controller;

import com.LensCart.entity.Users;
import com.LensCart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/all")
    public List<Users> getAllUsers(){

        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public Optional<Users> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping("/create")
    public void createUser(@RequestBody Users user){
        userService.createUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }

}
