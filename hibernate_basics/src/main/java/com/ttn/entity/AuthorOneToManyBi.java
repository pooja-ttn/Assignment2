package com.ttn.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorOneToManyBi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

//    Question 8
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

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


    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name="USER_ID")
            ,inverseJoinColumns = @JoinColumn(name = "Book_ID"))
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    Collection<BookManyToOne> book=new HashSet<>();

    public Collection<BookManyToOne> getBook() {
        return book;
    }

    public void setBook(Collection<BookManyToOne> book) {
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
