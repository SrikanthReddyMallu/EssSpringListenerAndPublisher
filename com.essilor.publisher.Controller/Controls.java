package com.essilor.publisher.Controller;

import com.essilor.publisher.Entity.Student;
import com.essilor.publisher.Service.PublishServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controls
{
    @Autowired
    PublishServer publishServer;
    @PostMapping("/publish")
    public Student savePublishs(@RequestBody Student student)
    {
        return publishServer.savePublish(student);
    }

}
