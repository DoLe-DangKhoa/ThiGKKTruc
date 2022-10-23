package com.example.loginservice.controller;

import com.example.loginservice.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/loginservice")

public class RestTemplateController {

    static final String FIND_BY_ID="http://localhost:8080/register/findbyregisterusername";
    static final String FIND_ALL="http://localhost:8080/subject/findallsubject";
    static final String INSERT_SUBJECT="http://localhost:8080/register/addregister";
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/callgetbyusername/{id}")
    public String callGetSubjectById(@PathVariable("id") String id){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
        return restTemplate.exchange(FIND_BY_ID+id, HttpMethod.GET, entity, String.class).getBody();
    }
    @PostMapping("/add")
    public String callCreateSubject(@RequestBody User user){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<User> entity = new HttpEntity<User>(user,headers);
        return restTemplate.exchange(INSERT_SUBJECT, HttpMethod.POST, entity, String.class).getBody();
    }




}
