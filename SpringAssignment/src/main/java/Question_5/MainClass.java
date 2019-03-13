package Question_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        Complex complex=context.getBean("complexBean", Complex.class);
        System.out.println(complex.getList());
        System.out.println(complex.getSet());
        System.out.println(complex.getMap());


    }
}
