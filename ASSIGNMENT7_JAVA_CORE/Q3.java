import java.util.Scanner;

public class Q3 {
//     Q3. Write a program to find the number of occurrences of a character in a string without using loop?

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        System.out.println("Enter the character");
        String c=s.nextLine();
        int tmp = str.length() - str.replaceAll(c,"").length();
        System.out.println("Number of times "+"\""+c+"\""+" occurred "+tmp);

}
}
