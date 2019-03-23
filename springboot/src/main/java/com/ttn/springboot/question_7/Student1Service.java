package com.ttn.springboot.question_7;

import com.ttn.springboot.question_7.entity.Student1;
import com.ttn.springboot.question_7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class Student1Service {

@Autowired
StudentRepository studentRepository;

        public List<Student1> getBooks(){
            List<Student1> list = new ArrayList<>();
            Iterator<Student1> iterator = studentRepository.findAll().iterator();
            iterator.forEachRemaining(list::add);
            return list;
        }
}
