package Question_6;

interface HotDrink{

    void prepareHotDrink();

}
class Tea implements HotDrink {

    public void prepareHotDrink(){
        System.out.println("Tea is being prepared");

    }
}

class ExpressTea  implements HotDrink {

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
