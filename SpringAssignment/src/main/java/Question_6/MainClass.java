package Question_6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Q6) Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.*/
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        Restaurant restaurant=context.getBean("restaurant2", Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
    }
}
