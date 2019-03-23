package com.ttn.springboot.question_7;

import com.ttn.springboot.question_7.entity.Student1;
import com.ttn.springboot.question_7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ApplicationStartedEvent.class)
   public void init(){
            Iterator iterator=studentRepository.findAll().iterator();
            if(!iterator.hasNext()){
                for(int i=1;i<4;i++){
                    Student1 student=new Student1(i,"Student "+i,i+"@gamil.com");
                     studentRepository.save(student);
            }
        }
        System.out.println("Application is inserting values ..");

    }


}
