package com.carbontracker.controller;

import com.carbontracker.entity.User;
import com.carbontracker.repository.UserRepository;

public class UserController {

UserRepository repository = new UserRepository();

public void registerUser(User user) {

repository.saveUser(user);

}

}