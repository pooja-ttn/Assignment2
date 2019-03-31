package com.ttn.restApiSpring.services;

import com.ttn.restApiSpring.entities.Student;
import com.ttn.restApiSpring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public void saveStudents(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudent(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Integer id){
        Optional<Student> optionalStudent=studentRepository.findById(id);
        return optionalStudent.isPresent()?optionalStudent.get():null;
    }

    public void updateStudentById(Integer id){
        Optional<Student> optionalStudent=studentRepository.findById(id);
        if(!optionalStudent.isPresent()==false){
            Student student=optionalStudent.get();
            student.setFirstName("Pooja");
            studentRepository.save(student);
        }else{
            System.out.println("null value");
        }
    }


    public void deleteStudentById(Integer id){
        studentRepository.deleteById(id);
    }
}
