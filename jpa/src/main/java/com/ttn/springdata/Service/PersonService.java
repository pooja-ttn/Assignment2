package com.ttn.springdata.Service;

import com.ttn.springdata.config.PersistenceContext;
import com.ttn.springdata.entity.Person;
import com.ttn.springdata.repository.PersonRepository;
import org.hibernate.transform.PassThroughResultTransformer;
import org.omg.CORBA.PERSIST_STORE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {
    ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
    PersonRepository personRepository = context.getBean(PersonRepository.class);

    public void Question2_3() {

        System.out.println("\n-----------------------------Question 2-3------------------\n");
        Person person = new Person();
        person.setAge(25);
        person.setFirstname("Pulkit");
        person.setLastname("Kumar");
        person.setSalary(15000);
        Person person1 = new Person();
        person1.setAge(21);
        person1.setFirstname("Pooja");
        person1.setLastname("Joshi");
        person1.setSalary(10000);
        Person person2 = new Person();
        person2.setAge(25);
        person2.setFirstname("Pawan");
        person2.setLastname("Joshi");
        person2.setSalary(10001);

        Person person3 = new Person();
        person3.setAge(29);
        person3.setFirstname("Kavita");
        person3.setLastname("Kumari");
        person3.setSalary(112220);

        Person person10 = new Person();
        person10.setAge(28);
        person10.setFirstname("Ram");
        person10.setLastname("Kumar");
        person10.setSalary(1000000);

        //create
        personRepository.save(person);
        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person10);


        //read
        System.out.println(personRepository.findByFirstname("Pulkit"));
        Iterator iterator = personRepository.findAllBy().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //update
        Person person4 = personRepository.findByFirstnameAndLastname("Pulkit", "Kumar");
        person4.setSalary(20000);
        personRepository.save(person4);
        //Delete
        personRepository.deleteByFirstname("Pulkit");

    }

    public void Question_4_5() {
        Person person = personRepository.findByFirstname("Pooja");
        System.out.print("\n\n------------------------Question 4----------------------------");
        System.out.println(person);
        List<Person> person4 = personRepository.findByLastname("Joshi");
        Iterator iterator = person4.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Person person5 = personRepository.findByAge(21);
        System.out.println("\n\n------------------Question 5---------------------");
        System.out.println(person5);
    }

    public void Question_6_7_8_9() {
        System.out.println("\n\n---------------------Question 6---------------------------");

        List<Person> person7 = personRepository.findByAgeGreaterThan25();
        Iterator iterator2 = person7.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        System.out.println("\n----------Question 7------------");
        System.out.println(personRepository.findFirstnameAndLastnameByAgeGreaterThan25());
        List<Object[]> obj = personRepository.findFirstnameAndLastnameByAgeGreaterThan25();
        for (Object[] objs : obj) {
            System.out.println(objs[0]);
            System.out.println(objs[1]);
        }

            System.out.println("\n---------------------Question 8------------------------");
            Person person8 = personRepository.findAllByAgeEqualTo25();
            System.out.println(person8);

            System.out.println("\n--------------------Question 9-----------------------");
            System.out.println(personRepository.countAllByFirstname("Peter"));

        }




public void Question_10(){

        System.out.println("\n------------------Question 10------------------\n");
        List<Person>person=personRepository.findDistinctByLastname("Joshi");
        System.out.println("Distict By Name-\n"+person);
    List<Person>person1=personRepository.findByFirstnameAndAge("Pooja",21);
    Iterator iterator = person1.iterator();
    System.out.println("\n Find By FirstName and Age-");
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }


    System.out.println("\n Find By FirstName or Age-");
    List<Person>person2=personRepository.findByFirstnameOrAge("Pooja",21);
    Iterator iterator2 = person2.iterator();
    while (iterator2.hasNext()) {
        System.out.println(iterator2.next());
    }


    System.out.println("\n Find person between 20 and max 30");
    List<Person> person4=personRepository.findByAgeBetween(20,30);
    Iterator iterator3 = person4.iterator();
    while (iterator3.hasNext()) {
        System.out.println(iterator3.next());
    }

    System.out.println("\nFind age less than 26-");
    List<Person>personList=personRepository.findByAgeLessThan(26);
    Iterator iterator1=personList.iterator();
    while(iterator1.hasNext())
    {
        System.out.println(iterator1.next());
    }


    System.out.println("\nFind age more than 24- \n");
    List<Person>personList1=personRepository.findByAgeGreaterThan(24);
    Iterator iterator4=personList1.iterator();
    while(iterator4.hasNext())
    {
        System.out.println(iterator4.next());
    }

    System.out.println("\nFind by name like %ooja");
    List<Person>personList2=personRepository.findByFirstnameLike("%ooja");
    Iterator iterator5=personList2.iterator();
    while(iterator5.hasNext())
    {
        System.out.println(iterator5.next());
    }

    System.out.println("\nFind by name  not Pooja");
    List<Person>personList3=personRepository.findByFirstnameNot("Pooja");
    Iterator iterator6=personList3.iterator();
    while(iterator6.hasNext())
    {
        System.out.println(iterator6.next());
    }


    System.out.println("\nFind by age in list[22,23,25]");
    List list=Arrays.asList(22,23,25);
    List<Person>personList6=personRepository.findByAgeIn(list);
    Iterator iterator7=personList6.iterator();
    while(iterator7.hasNext())
    {
        System.out.println(iterator7.next());
    }

    System.out.println("\nFind by Name IgnoreCase");
    List<Person> personList4=personRepository.findByFirstnameIgnoreCase("POOJA");
    Iterator iterator8=personList4.iterator();
    while(iterator8.hasNext())
    {
        System.out.println(iterator8.next());
    }

}


public void Question_11(){
        System.out.println("\n\n-----------------Question 11------------------");
       List<Person>person1= personRepository.findByAgeGreaterThanOrderByIdDesc(25);
  System.out.println(person1);

}

public void Question_12(){
        System.out.println("\n------------------Question 12------------------");
        Sort sort=new Sort(Sort.Direction.DESC,"id");
List<Person> personList=personRepository.findByAgeGreaterThan(25,sort);
System.out.println(personList);
}


public void Question_13(){
        System.out.println("\n---------------------Question 13-----------------------\n");
        Page<Person> personPage=personRepository.findAll(new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
List<Person>personList=personPage.getContent();
Page<Person>personPage1=personRepository.findAll(new PageRequest(1,1,new Sort(Sort.Direction.DESC,"id")));

List<Person>personlist1=personPage1.getContent();
System.out.println("\n Content of page 0- ");
Iterator iterator=personList.iterator();
while(iterator.hasNext()){
    System.out.println(iterator.next());
}
    System.out.println("\n\n Content of page 1-");
    Iterator iterator1=personlist1.iterator();
    while(iterator1.hasNext()){
        System.out.println(iterator1.next());
    }
}

    }


