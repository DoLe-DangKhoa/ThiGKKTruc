package com.example.activemq.service;

import com.example.activemq.config.ActiveMQ;
import com.example.activemq.entity.User;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class GetSubject {
    // de nhan du lieu tu Queue
    @JmsListener(destination = ActiveMQ.SUBJECT_QUEUE)
    public void receiveSubject(User subject) {
        System.out.println("Received subject message: " + subject.toString());
    }
}

