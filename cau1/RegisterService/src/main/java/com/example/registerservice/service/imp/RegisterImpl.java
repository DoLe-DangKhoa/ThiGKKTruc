package com.example.registerservice.service.imp;

import com.example.registerservice.entity.Register;
import com.example.registerservice.repository.RegisterRepository;
import com.example.registerservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public RegisterImpl(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public <S extends Register> S save(S entity) {
        return registerRepository.save(entity);
    }

    @Override
    public Iterable<Register> findAll() {
        return registerRepository.findAll();
    }

    @Override
    @Query("select sj from Register sj where sj.userId=?1")
    public List<Register> getById(String id) {
        return registerRepository.getById(id);
    }

    @Override
    public String getByUsername(String username) {
        return "co username";
    }


}
