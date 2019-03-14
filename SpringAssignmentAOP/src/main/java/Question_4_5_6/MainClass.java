package Question_4_5_6;

/*Q 4)  Create a logging aspect. Create a pointcut to log all methods Of services .*/

/*Q 5)  Add a logging statement before and after the method ends*/
/*Q6)  Log all the methods which throw IOException */

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext cxt=new ClassPathXmlApplicationContext("SpringConfig.xml");
        Services services=cxt.getBean(Question_4_5_6.Services.class);
        services.start();
        System.out.println("\n");
        services.setInteger(10);
        System.out.println("\n");
        services.getInteger();
        System.out.println("\n");

        services.throwing();
    }
}
