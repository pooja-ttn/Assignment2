
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/*

Q10) Use @Component, @Controller, @Repository etc annotation to configure Tea and Restaurant in Spring Container.

*/

/*

Q3)
Create a class Restaurant. Create an interface HotDrink with an abstract method prepareHotDrink.
Create two classes Tea and ExpressTea which implements HotDrink Class.
Create an instance variable of type HotDrink in Restaurant class.
Configure Tea and ExpressTea classes beans in Spring XML.
create a bean with the name teaRestaurant of type Restaurant which inject Tea object as dependency using setter method.
*/



interface HotDrink{

    void prepareHotDrink();

}
@Component
class Tea implements HotDrink{

   public void prepareHotDrink(){
       System.out.println("Tea is being prepared");

    }
}

@Component
class ExpressTea implements HotDrink{

    public void prepareHotDrink(){
        System.out.println("ExpressTea is being prepared");

    }
}

/*Q 9)

Use @Autowired annotation to wire Tea with Restaurant class Using setter method, field and constructor.

*/
@Controller
public class Restaurant {
    @Autowired
 /*   @Qualifier("tea")*/
   private HotDrink hotDrink;

    Restaurant(){}

//@Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;

    }

    //@Autowired
    public HotDrink getHotDrink() {
        return hotDrink;
    }


    /*

    Q8)   Use @Required annotation for hotDrink setter method in Restaurant class.

    */

    @Autowired
    //@Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
