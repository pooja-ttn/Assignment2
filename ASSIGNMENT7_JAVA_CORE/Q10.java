import com.sun.scenario.effect.impl.prism.PrTexture;
import java.util.Scanner;
public class Q10 {
/*Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the two integer values");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter the two float values");
        float c=s.nextFloat();
        float d=s.nextFloat();
        System.out.println("Enter the two double values");
        double e=s.nextDouble();
        double f=s.nextDouble();

        System.out.println("Enter the three strings ");
        String str=s.next();
        String str1=s.next();
        String str2=s.next();

        Q10 obj=new Q10();

        System.out.println("Adding 2 integer numbers = "+obj.add(a,b));
        System.out.println("Adding 2 double numbers = "+obj.add(e,f));
        System.out.println("Multilpying the 2 integer numbers = "+obj.mul(a,b));
        System.out.println("Multiplying the 2 float numbers = "+obj.mul(c,d));
        System.out.println("Concating 2 Strings = "+obj.con(str,str1));
        System.out.println("Concating 3 Strings = "+obj.con(str,str1,str2));

    }

    public int add(int a,int b)
    {
     return a+b;
    }

    public double add(double a ,double b)
    {
        return (a+b);
    }


    public int mul(int a,int b)
    {
        return a*b;
    }

    public float mul(float a,float b)
    {
        return a*b;
    }

    public String con(String str,String str1)
    {
        return (str+str1);
    }


    public String con(String str,String str1,String str3)
    {
        return (str + str1+str3);
    }
    }
