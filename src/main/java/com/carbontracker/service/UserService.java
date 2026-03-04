package com.carbontracker.service;

import java.util.List;

import com.carbontracker.entity.User;
import com.carbontracker.repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    // CREATE
    public void registerUser(User user) {
        userRepository.saveUser(user);
    }

    // READ
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

}