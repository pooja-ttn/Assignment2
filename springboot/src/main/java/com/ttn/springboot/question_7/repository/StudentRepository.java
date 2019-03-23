package com.ttn.springboot.question_7.repository;

import com.ttn.springboot.question_7.entity.Student1;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student1,Integer> {

}
