package Question_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Question 3-
*  Use datasource with DriverManagerDataSource, dbcp2.BasicDataSource and SingleConnectionDataSource
to print the records of user tables

*/

public class MainClass{
    public static void main(String[] args)throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig2.xml");
        Dao dao=context.getBean("dao",Dao.class);
System.out.println("-----------------Using DriverManagerDataSource--------------------");
dao.printUserNames();

        ApplicationContext context1=new ClassPathXmlApplicationContext("SpringConfig.xml");
        Dao dao1=context1.getBean("dao1",Dao.class);
        System.out.println("\n-----------------Using dbcp2.BasicDataSource--------------------");

        dao1.printUserNames();

        ApplicationContext context2=new ClassPathXmlApplicationContext("SpringConfig3.xml");
        Dao dao2=context2.getBean("dao2",Dao.class);
        System.out.println("\n-----------------Using SingleConnectionDataSource--------------------");

        dao2.printUserNames();
    }
}