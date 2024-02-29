package com.essilor.publisher.Listeners;

import com.essilor.publisher.Entity.Student;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Srikanth
{
    @EventListener
    public void Srikanth1(Student student)
    {
        System.out.println(" Srikanth Id is="+student.getId());
        System.out.println(" Srikanth Name is="+student.getName());
        System.out.println(" Srikanth Village is="+student.getVillage());
        System.out.println(" Srikanth Phno is="+student.getPhno());
    }

}
