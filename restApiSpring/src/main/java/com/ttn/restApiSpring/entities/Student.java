package com.ttn.restApiSpring.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer studentId;
    @NotBlank(message = "Blanks Not allowed")

//    Question 6-
//    @JsonIgnore
    private String firstName;
    private String lastName;
    @NotNull(message = "Size must be greater than zero")
    private Integer standard;

    public Student(String firstName, String lastName, Integer standard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.standard = standard;
    }

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }
}
