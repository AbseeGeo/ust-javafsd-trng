package com.ust.day5;

import java.util.ArrayList;

public class Student {
    private int rollno;
    private String name;
    private int age;

    public Student(String name, int age, int rollno) {

        this.name = name;
        this.age=age;
        this.rollno=rollno;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }
}

