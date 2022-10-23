package com.example.registerservice.controller;

import com.example.registerservice.entity.Register;
import com.example.registerservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")

public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/addregister")
    public ResponseEntity<Object> createRegister(@RequestBody Register register){
        register = registerService.save(register);
        return  new ResponseEntity<>("Thêm thành công!", HttpStatus.CREATED);
    }
    @GetMapping("/findallregister")
    public ResponseEntity<Object> findAall(){
        Iterable<Register> list= registerService.findAll();
        return  new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/findbyregisterid/{id}")
    public ResponseEntity<Object> findById(@PathVariable("id") String id){
        List<Register> list= registerService.getById(id);
        return  new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/findbyregisterid/{username}")
    public ResponseEntity<Object> findByUsername(@PathVariable("username") String username){
        String list= registerService.getByUsername(username);
        return  new ResponseEntity<>(list, HttpStatus.OK);
    }


}
