package Question_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Question 10-

Integrate Hibernate with Spring and use hql query to count the number of records in user table.
*/
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig_10.xml");
        Dao dao=applicationContext.getBean("dao5",Dao.class);
        UserTable user=new UserTable();
        dao.countRecord();

    }
}
