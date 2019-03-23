package com.ttn.springboot.question1_2;

import org.springframework.stereotype.Repository;


public class Student {
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Student(){

    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
