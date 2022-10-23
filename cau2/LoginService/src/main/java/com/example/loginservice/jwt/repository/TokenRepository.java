package com.example.loginservice.jwt.repository;


import com.example.loginservice.jwt.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
