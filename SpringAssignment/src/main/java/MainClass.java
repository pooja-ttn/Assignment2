import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        /*
      Q2) Get the bean of the Database class from spring container and print the values of the instance variable.
       */
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        Database database=context.getBean("database",Database.class);
        System.out.println("Q2)"+database);

        /*
        Q4)
        Get both the beans and invoke prepareHotDrink method via hotDrink
        instance variables. Try inner bean with expressTeaRestaurant.
        */
Restaurant restaurant=context.getBean("teaRestaurant",Restaurant.class);
restaurant.getHotDrink().prepareHotDrink();
Restaurant restaurant1=context.getBean("expressTeaRestaurant",Restaurant.class);
restaurant1.getHotDrink().prepareHotDrink();


/*
Q5)    Create Class Complex as follows: class complex {    List list;

            Set set;

            Map map;

        } Initialize all the instance variables of the complex class using Spring XML. Give bean name as

        complexBean. Get the bean and display the properties of Complex */

Complex complex=context.getBean("complexBean",Complex.class);
System.out.println(complex.getList());
System.out.println(complex.getSet());
System.out.println(complex.getMap());




/*
        Q7) Set the scope of the teaRestaurant bean as proptotype and check the scope type after accessing the bean.
*/

System.out.println("Q7) "+context.isPrototype("teaRestaurant"));

/*
    <!--Q6)  Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.-->
*/

        Restaurant restaurant2=context.getBean("restaurant2",Restaurant.class);
        restaurant2.getHotDrink().prepareHotDrink();
        Restaurant restaurant4=context.getBean("restaurant4",Restaurant.class);
        restaurant4.getHotDrink().prepareHotDrink();
        Restaurant restaurant5=context.getBean("restaurant5",Restaurant.class);
        restaurant5.getHotDrink().prepareHotDrink();




    }
}
