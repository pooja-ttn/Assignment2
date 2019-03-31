package com.ttn.restApiSpring.repositories;

import com.ttn.restApiSpring.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
