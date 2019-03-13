package Question_3_4;


/*Get both the beans and invoke prepareHotDrink method via hotDrink
instance variables. Try inner bean with expressTeaRestaurant.*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        Restaurant restaurant=context.getBean("teaRestaurant", Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
        Restaurant restaurant1=context.getBean("expressTeaRestaurant", Restaurant.class);
        restaurant1.getHotDrink().prepareHotDrink();
    }
}
