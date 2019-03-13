package Question_7_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Q7) Set the scope of the teaRestaurant bean as proptotype and check the scope type after accessing the bean.

Q8)
Use @Required annotation for hotDrink setter method in Restaurant class.

*/
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        System.out.println(context.isPrototype("teaRestaurant.")); /*CHECKING SCOPE*/

        Restaurant restaurant2=context.getBean("restuarant.", Restaurant.class);
        restaurant2.getHotDrink().prepareHotDrink();

    }
}
