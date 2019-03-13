package Question_9_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        /*Q 9)*/
      /*  ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
        Restaurant restaurant=applicationContext.getBean("restaurant1",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        */


        /*Q 10*/

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("Question_9_10");
        annotationConfigApplicationContext.refresh();
    Restaurant restaurant1=annotationConfigApplicationContext.getBean(Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();
}
}
