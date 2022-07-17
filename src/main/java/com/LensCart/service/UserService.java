package com.LensCart.service;

import com.LensCart.Repository.UserRepository;
import com.LensCart.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Users> getAllUsers(){
        return new ArrayList<>(userRepository.findAll());
    }
    public Optional<Users> getUserById(int id){
        return userRepository.findById(id);
    }
    public void deleteUser(int id)
    {
        userRepository.deleteById(id);
    }
    public void createUser(Users user){
        userRepository.save(user);
    }


}
