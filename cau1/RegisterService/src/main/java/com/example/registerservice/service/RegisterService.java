package com.example.registerservice.service;

import com.example.registerservice.entity.Register;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegisterService {
    <S extends Register> S save(S entity);

    Iterable<Register> findAll();

    @Query("select sj from Register sj where sj.userId=?1")
    List<Register> getById(String id);

    @Query("select sj from Register sj where sj.username like 'sa'")
    String getByUsername(String username);
}
