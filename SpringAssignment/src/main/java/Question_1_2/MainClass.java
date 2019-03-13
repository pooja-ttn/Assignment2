package Question_1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        /*

Q1)Create a class Database with 2 instance variables port and name.
 Configure Database class bean in spring container through Spring XML.
  Initialize instance variables using setter method.

*/

/*
        Q2) Get the bean of the Question_1_2.Database class from spring container and print the values of the instance variable.
*/

        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        Database database=context.getBean("database", Database.class);
        System.out.println("Name "+database.getName()+" \nPort "+database.getPort());
    }
}
