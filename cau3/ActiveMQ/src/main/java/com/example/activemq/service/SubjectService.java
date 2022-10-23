package com.example.activemq.service;

import com.example.activemq.config.ActiveMQ;
import com.example.activemq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendSubject(User subject){
        System.out.println("Sending subject message" + subject.toString() + " to queue " + ActiveMQ.SUBJECT_QUEUE);
        jmsTemplate.convertAndSend(ActiveMQ.SUBJECT_QUEUE, subject);
    }
}
