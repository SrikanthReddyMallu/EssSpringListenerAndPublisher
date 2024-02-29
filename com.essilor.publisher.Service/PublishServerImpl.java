package com.essilor.publisher.Service;

import com.essilor.publisher.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PublishServerImpl implements PublishServer {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public Student savePublish(Student student) {
       // Student student = new Student(101, "srikanth", "Tadipatri", 8873323);
        applicationEventPublisher.publishEvent(student);
        return null;
    }

}