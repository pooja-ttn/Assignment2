


// Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

    enum House{
    BHK_1(2000000),BHK_2(4000000),BHK_3(8000000);

    private int prices;

    House(int prices)
    {
      //Constructor
        this.prices=prices;
    }
    public int getPrice()
    {
        //getPrice()
        return prices;
    }

    }

class Q9{
    House h1;

    public static void main(String[] args)
    {
        Q9 obj=new Q9();
        obj.h1=House.BHK_1;
        Q9 obj2=new Q9();
        obj2.h1=House.BHK_2;
        Q9 obj3=new Q9();
        obj3.h1=House.BHK_3;
        System.out.println("House- "+obj.h1+" Price = "+obj.h1.getPrice());
        System.out.println("House- "+obj2.h1+" Price = "+obj2.h1.getPrice());
        System.out.println("House- "+obj3.h1+" Price = "+obj3.h1.getPrice());

    }

}
