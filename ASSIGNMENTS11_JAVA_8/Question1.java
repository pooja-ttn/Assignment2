
/*
Exercise

    Write the following a functional interface and implement it using lambda:
        (1) First number is greater than second number or not    Parameter (int ,int ) Return boolean
        (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        (3) Concatination of 2 string Parameter (String , String ) Return (String)
        (4) Convert a string to uppercase and return . Parameter (String) Return (String)
*/




interface Concatenation1{
    String Concat(String str,String str1);
}

interface Greater1{
    boolean isGreater(int a,int b);
}

interface Increment1{
    int increment(int a);
}

interface  UpperCase2 {

    String upper1(String str);
}

public class Question1 {
    public static void main(String[] args) {


        Greater1 obj4=(a, b)-> {
            return a>b?true:false;

        };
        System.out.println("1) First number is greater than Second- "+obj4.isGreater(2,6));



        Increment1 obj2=a->++a;
        System.out.println("2) Incremented value of 2 is "+ obj2.increment(2));


        Concatenation1 obj1=(a,b)->a+b;
        System.out.println("3) Concatenated String- "+obj1.Concat("Pooja","Joshi"));



        UpperCase2 obj3=a->a.toUpperCase();
        System.out.println("4) To UpperCase String- "+obj3.upper1("pooja"));
}
}
