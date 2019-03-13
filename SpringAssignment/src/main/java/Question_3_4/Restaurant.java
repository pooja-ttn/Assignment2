package Question_3_4;


/*
Q3)
Create a class Restaurant.
Create an interface HotDrink with an abstract method prepareHotDrink.
 Create two classes Tea and ExpressTea which implements HotDrink Class.
  Create an instance variable of type HotDrink in Restaurant class.
  Configure Tea and ExpressTea classes beans in Spring XML.
  create a bean with the name teaRestaurant of type Restaurant which inject Tea object as dependency using setter method.

*/


interface HotDrink{

    void prepareHotDrink();

}
class Tea  implements HotDrink{

    public void prepareHotDrink(){
        System.out.println("Tea is being prepared");

    }
}

class ExpressTea  implements HotDrink{

    public void prepareHotDrink(){
        System.out.println("ExpressTea is being prepared");

    }
}

public class Restaurant {
    private HotDrink hotDrink;

    Restaurant(){}

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;

    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }



    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
