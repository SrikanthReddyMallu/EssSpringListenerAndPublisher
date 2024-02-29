package com.essilor.publisher.Entity;

public class Student
{
    private int id;
    private String name;
    private String village;
    private long phno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", village='" + village + '\'' +
                ", phno=" + phno +
                '}';
    }

//    public Student(int id, String name, String village, long phno) {
//        this.id = id;
//        this.name = name;
//        this.village = village;
//        this.phno = phno;
//    }

}
