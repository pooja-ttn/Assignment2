import java.io.IOException;

public class Q6 {

//     Q6. WAP showing try, multi-catch and finally blocks.
    public static void main(String[] args) {
    int a=10;
    int b=0;
    try{
      int c=a/b;
    }
    catch(NullPointerException e)
    {
        e.printStackTrace();
    }

    catch (ArithmeticException e1)
    {                                 //    This will catch the exception
        e1.printStackTrace();
    }


    finally {

       System.out.println("finally with execute irrespective of if exception occurred or not");
    }
}
}
