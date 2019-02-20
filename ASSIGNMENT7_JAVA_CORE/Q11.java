import java.util.*;
public class Q11 {

//     Q11. Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide
//          there specific details like rate_of_interest etc,print details of every banks

    public static void main(String[] args) {
        Bank obj=new Bank();
        System.out.println("Main Bank Class details-");
        obj.getDetails();

        Bank obj1=new SBI();
        System.out.println("\n\nSBI details-");
        obj1.getDetails();

        Bank obj2=new BOI();
        System.out.println("\n\nBOI details-");
        obj2.getDetails();

        ICICI obj3=new ICICI();
        System.out.println("\n\nICICI details-");
        obj3.getDetails();


    }
}
class Bank{
    public void getDetails()
    {
        System.out.println("Hi This is a bank!! Interest varies from 4-7%");
        System.out.println("Minimum balance to start a new account varies from 5000-10,000 ");
    }

}
 class SBI extends Bank{
   @Override
    public void getDetails(){
             System.out.println("SBI has interest 4%");
             System.out.println("Minimum balance is 5000/ ");
             System.out.println("Govt Bank");
    }


 }

 class BOI extends Bank{
    @Override
     public void getDetails(){
        System.out.println("BOI has interest 5%");
        System.out.println("Minimum balance is 10000/ ");
        System.out.println("Govt Bank");

    }
 }


class ICICI extends Bank{
    @Override
    public void getDetails(){
        System.out.println("ICICI has interest 7%");
        System.out.println("Minimum balance is 15000/ ");
        System.out.println("Private Bank");

    }
}