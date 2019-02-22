package Q10;


public class Customer {
    public String name;
    public String pdt;
    public int price;
   private static int  token=190;
/*
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Customer(String name) {
        this.name=name;
        pdt = "Latte";
        price = 100;
    }

    public void order() {
        System.out.println("\n"+name+"'s order");
        System.out.println(pdt + " " + price+"/");
    }

    public int pay() {
        System.out.println("\n"+name+" paid price "+price);
        return price;
    }




    public void ready()
    {
        new Thread(new Runnable(){

            @Override
            public void run()
            {
                try{
                    Thread.sleep(9000);


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Order taken by Customer "+token);
                     token++;
            }
        }).start();

    }

}
