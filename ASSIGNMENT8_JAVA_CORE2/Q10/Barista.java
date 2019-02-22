package Q10;
import java.util.Scanner;

public class Barista{
    String next_order="Y";
    static int token3=190;
    public Barista() {
        System.out.println("\nWelcome to Barista");
        this.next_order="Y";
    }

    public boolean manage(){
Scanner s=new Scanner(System.in);
        System.out.println("\nIs there new order(Y/N)");

next_order=s.next();
char order=next_order.charAt(0);

        if(order=='Y'||order=='y'){
            return true;
        }
        else
            return false;
    }

public void entry(String name)
{
System.out.println("Hi "+name);
}


public void prepare()
{
        System.out.println("Order under preparartion");
    }


    public void readyCoffee()
    {
        new Thread(new Runnable(){

            @Override
            public void run()
            {
                try{
                    Thread.sleep(8000);


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("Order Ready for token id "+token3);
                token3++;
            }
        }).start();

    }
}
