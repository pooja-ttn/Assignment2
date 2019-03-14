package Question2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Q2) Create listeners for spring events.*/

public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
        applicationContext.start();

         applicationContext.stop();


    }
}
