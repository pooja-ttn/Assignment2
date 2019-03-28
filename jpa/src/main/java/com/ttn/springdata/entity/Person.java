package com.ttn.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/*Question 1 -Create a Person com.ttn.springdata.entity with instance variables Firstname,
 Lastname, salary, age and Id.*/
@Entity
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstname;
    String lastname;
    int salary;
    int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
