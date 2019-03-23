package com.ttn.springboot.question1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/*Question 1-
Create a Restful API using Spring Boot for Student.
*/

/*Question 2-
 Run Spring Boot Application with all the three ways (1 Mark)

 Answer 2)
 1)Run the Main java class marked with @SpringBootApplication Annotation
 2)Execute the bootRun Gradle tasks
 3)Create an Executable jar with the help of bootJar Gradle task
 */


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping("/student")
    public List<Student> getStudentDetails(){
        return studentService.getDetails();

    }

    }

