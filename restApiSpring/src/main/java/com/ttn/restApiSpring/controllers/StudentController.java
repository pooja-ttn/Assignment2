package com.ttn.restApiSpring.controllers;
import com.ttn.restApiSpring.entities.Student;
import com.ttn.restApiSpring.exceptions.UserNotFoundException;
import com.ttn.restApiSpring.services.StudentServices;
import com.ttn.restApiSpring.version.Name;
import com.ttn.restApiSpring.version.StudentV1;
import com.ttn.restApiSpring.version.StudentV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
/*Question 1-
Create a Rest API for Student using noun plurals for endpoint and http verbs for different operations.(1 Mark)
*/
/*Question 2 -
Create a Customise Exception Handler.(1 Mark)
*/

/*QUESTION 3=
Print the Validation Messages of student Entity in response.(
*/


/*Question 4-
Perform Internationalization for a greeting message in your app.(*/


//Question 5-    Return XML Response when new Student is created.(1 Mark)

//Question 6-Ignore ID field in the Response.(1 Mark)

/*
 Question 7-
 Create 2 versions of your API one take represent name of the Student as single string
 and other showing firstname and lastname seperately.
 (Create the Versions of the API using URI, parameter and header versioning) (2 Marks)

  */


/*Question 8-
* Perform CRUD operations on the resource below using  RestTemplate                     */


@RestController
public class StudentController {


    @Autowired
    StudentServices studentServices;

    //Question 1
    @PostMapping("/users")
    public ResponseEntity saveStudents() {
        Student student1 = new Student("pawan", "Joshi", 2);
        studentServices.saveStudents(student1);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student1.getStudentId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/users")
    public List<Student> getStudents() {
        List<Student> students = studentServices.getAllStudent();
        return students;
    }

    @PutMapping("/users/{userId}")
    public void updateStudent(@PathVariable("userId") Integer id) {
        studentServices.updateStudentById(id);

    }

    @DeleteMapping("/users/{userId}")
    public void deleteStudent(@PathVariable("userId") Integer id) {
        studentServices.deleteStudentById(id);
    }


    //Question 2
    @GetMapping("/users/{userId}")
    public Student getUserWithId(@PathVariable("userId") Integer id) {

        Student student = studentServices.getStudentById(id);
        if (student == null) {
            throw new UserNotFoundException("User with this id not found");
        }
        return student;
    }

    //Question 3
    @PostMapping("/users/2")
    public ResponseEntity<Student> saveUser(@Valid @RequestBody Student student) {
        studentServices.saveStudents(student);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getStudentId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @Autowired
    MessageSource messageSource;


    //QUestion 4
    @GetMapping("/")
    String Hello() {
        return messageSource.getMessage("Hello", null, LocaleContextHolder.getLocale());

    }

    //Question 5-
    @PostMapping(value = "/userRegister", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity saveStudent(@RequestBody Student student) {
        studentServices.saveStudents(student);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getStudentId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    //Question 6-
    //URI versioning
    @GetMapping(value = "/student/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("Pooja Joshi");
    }

    @GetMapping(value = "/student/V2")
    StudentV2 getStudentV2() {
        return new StudentV2(new Name("Pooja", "Joshi"));
    }

    //Query parameter versioning
    @GetMapping(value = "/student/param", params = "version=1")
    StudentV1 getStudentV1Param() {
        return new StudentV1("Pooja Joshi");
    }

    @GetMapping(value = "/student/param", params = "version=2")
    StudentV2 getStudentV2Param() {
        return new StudentV2(new Name("Pooja", "Joshi"));
    }

//    Header versioning
    @GetMapping(value = "/student/header", headers = "API-VERSION=1")
    StudentV1 getStudentV1Header() {
        return new StudentV1("Pooja Joshi");
    }

    @GetMapping(value = "/student/header", headers = "API-VERSION=2")
    StudentV2 getStudentV2Header() {
        return new StudentV2(new Name("Pooja", "Joshi"));
    }


    //Content negotiation
    @GetMapping(value = "student/produce", produces = "application/app-v1+json")
    StudentV1 getStudentV1Produce() {
        return new StudentV1("Pooja Joshi");
    }

    @GetMapping(value = "student/produce",produces= "application/app-v2+json")
    StudentV2 getStudentV2Produce() {
        return new StudentV2(new Name("Pooja", "Joshi"));
    }

}