package com.ttn.springdata.repository;


import com.ttn.springdata.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {


// Question 3-

    //create and Update
    Person save(Person person);
    //read
    List<Person> findAllBy();

    //delete
    @Transactional
    void deleteByFirstname(String name);

Person findByFirstnameAndLastname(String name,String name2);

//Question 4-
    Person findByFirstname(String name);
    List<Person>findByLastname(String name);
    Person findByAge(int age);


//Question 6
    @Query("select p from Person p where p.age>25")
    List<Person> findByAgeGreaterThan25();
 //Question 7
 @Query("select p.firstname, p.lastname from Person p where p.age>25")
     List<Object[]> findFirstnameAndLastnameByAgeGreaterThan25();

 //Question 8

    @Query("select p from Person p where p.age=25")
    Person findAllByAgeEqualTo25();

 //Question 9
@Query("select Count(*) from Person p where p.firstname=:name")
    int countAllByFirstname(@Param("name")String name);

/*Question 10-
         count
        ◦ distinct
        ◦ or
        ◦ and
        ◦ between
        ◦ LessThan
        ◦ GreaterThan
        ◦ Like
        ◦ Not 
        ◦ In 
        ◦ IgnoreCase*/

int countAllByAge(int age);
List<Person> findDistinctByLastname(String name);
List<Person> findByFirstnameOrAge(String firstname,int age);
    List<Person> findByFirstnameAndAge(String firstname,int age);
    List<Person> findByAgeBetween(int min,int max);
    List<Person> findByAgeLessThan(int age);
    List<Person> findByAgeGreaterThan(int age);
    List<Person> findByFirstnameLike(String name);
    List<Person> findByFirstnameNot(String name);
    List<Person> findByAgeIn(List<Integer> ageList);
    List<Person> findByFirstnameIgnoreCase(String name);
    List<Person> findByAgeGreaterThan(int age, Sort sort);


    //Question 11-
    List<Person> findByAgeGreaterThanOrderByIdDesc(int age);

//Question 12-
Page<Person> findAll(Pageable pageable);
}
