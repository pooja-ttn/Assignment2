import java.util.Scanner;


public class Q1 {

//    Q1. Write a program to replace a substring inside a string with other string ?


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        System.out.println("Enter the substring to be replaced");
        String str2=s.nextLine();
        System.out.println("Enter the other string");
        String str3=s.nextLine();
        String str1=str.replace(str2,str3);
        System.out.println("The new replaced string is "+str1);


    }
}
