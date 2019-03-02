/* Q 6)Implement Decorator pattern to decorate the Pizza with topings.*/

interface Pizza {
    String info();
}

class RegularPizza implements Pizza {

    @Override
    public String info() {
        return "Regular Pizza" ;
    }
}


class MediumPizza implements Pizza {

    @Override
    public String info() {
        return "Medium Pizza" ;
    }
}

class VegPizza implements Pizza {
    Pizza pizza;
    String vegetable;
    public VegPizza(Pizza pizza,String vegetable) {
        this.pizza = pizza;
        this.vegetable=vegetable;
    }

    @Override
    public String info() {
        return this.vegetable+" "+pizza.info()+" ";
    }
}


class ExtraCheesePizza implements Pizza{
    Pizza pizza;
    String cheese;
    public ExtraCheesePizza(Pizza pizza,String cheese) {
        this.pizza = pizza;
        this.cheese=cheese;
    }
    @Override
    public String info(){
        return pizza.info()+" With extra "+cheese+" cheese";
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        RegularPizza regularPizza=new RegularPizza();
        System.out.println(regularPizza.info());

        VegPizza onionPizza=new VegPizza(new RegularPizza(),"Onion");
        System.out.println(onionPizza.info());

        VegPizza capsicumPizza=new VegPizza(new ExtraCheesePizza(new RegularPizza(),"Mozzarella"),"Capsicum");
        System.out.println(capsicumPizza.info());
    }
}