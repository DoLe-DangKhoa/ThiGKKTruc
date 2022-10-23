package com.example.loginservice.jwt.service;


import com.example.loginservice.jwt.entity.User;
import com.example.loginservice.jwt.entity.authen.UserPrincipal;

public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
