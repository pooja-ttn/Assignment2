import java.util.Scanner;

public class Q8 {
//  Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        str1.delete(4,10);
        System.out.println("Output string = "+str1.toString());
    }
}
