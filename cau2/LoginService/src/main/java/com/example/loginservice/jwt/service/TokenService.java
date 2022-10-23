package com.example.loginservice.jwt.service;


import com.example.loginservice.jwt.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
