package Question_9_10;


import com.sun.scenario.effect.impl.prism.PrTexture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface HotDrink{

    void prepareHotDrink();

}
@Component/*Question 10*/
class Tea  implements HotDrink{

    public void prepareHotDrink(){
        System.out.println("Tea is being prepared");

    }
}

class ExpressTea  implements HotDrink {

    public void prepareHotDrink(){
        System.out.println("ExpressTea is being prepared");

    }
}
//@Component
/*Question 10*/
public class Restaurant {
//    @Autowired
    private HotDrink hotDrink;

    Restaurant(){
        System.out.println("This is a default constructor");
    }

//    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        System.out.println("This is a parameterized constructor");

    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//@Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        System.out.println("Setter method");
    }
}
