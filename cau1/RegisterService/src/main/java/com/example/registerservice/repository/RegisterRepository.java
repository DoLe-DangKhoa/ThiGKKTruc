package com.example.registerservice.repository;

import com.example.registerservice.entity.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends CrudRepository<Register, String> {
    @Query("select sj from Register sj where sj.userId=?1")
    List<Register> getById(String id);

}