package com.ttn.springboot.question1_2;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getDetails(){

        return Arrays.asList(new Student(1,"Pooja Joshi"),new Student(2,"Anmol Garg"),new Student(3,"Beena Joshi"),new Student(4,"Harsh Bhatia"));
    }
}
