package Question3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Q 3) Create a CustomEvent which should get published when you invoke connect method of database bean. */

public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Database database=configurableApplicationContext.getBean("database",Database.class);
        MyApplicationPublisher myApplicationPublisher = configurableApplicationContext.getBean("publisher", MyApplicationPublisher.class);
        database.connect();
        myApplicationPublisher.display();
    }
}