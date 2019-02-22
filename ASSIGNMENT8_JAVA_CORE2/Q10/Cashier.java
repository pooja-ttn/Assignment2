package Q10;

public class Cashier {
static int token=190;

    public void  payment(int price) {
        System.out.println("\nCashier accpeted payment of " + price + "/");
    }
    public int getToken(){
        int token4=token;
        System.out.println("Token id-"+Cashier.token);
        token++;
        return token4;
    }


    public void waitNotify()
    {
        System.out.println("Order is accepted !! Wait for your turn");
    }
}
