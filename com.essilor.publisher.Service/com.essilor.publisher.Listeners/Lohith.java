package com.essilor.publisher.Listeners;

import com.essilor.publisher.Entity.Student;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Lohith
{
    @EventListener
    public void Lohith1(Student student)
    {
        System.out.println("Lohith1 Id is="+student.getId());
        System.out.println("Lohith1 Name is="+student.getName());
        System.out.println("Lohith1 Village is="+student.getVillage());
        System.out.println("Lohith1 Phno is="+student.getPhno());
    }
}
