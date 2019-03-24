package com.ttn.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


@Entity
public class AuthorOneToManyWithoutAdditionalTable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "author_id")
    public int id;

    @Column(name = "Firstname")
    private String firstName;

    //Question 6
    @Transient
    @Column(name="LastName")
    private  String lastName;

    @Column(name = "Author_age")
    private int age;


    //Question 7
    @Temporal(TemporalType.DATE)
    @Column(name ="date_of_birth")
    private Date dob;


    //Question 10
    @Embedded
    private Address address;


    @OneToMany(mappedBy = "author")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    Collection<BookManyToOneWithoutTable> book=new HashSet<>();
    public Collection<BookManyToOneWithoutTable> getBook() {
        return book;
    }

    public void setBook(Collection<BookManyToOneWithoutTable> book) {
        this.book = book;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{ " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
