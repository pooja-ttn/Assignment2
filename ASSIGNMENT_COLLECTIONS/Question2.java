import java.util.*;
public class Question2 {
    /*Write a method that takes a string and returns the number of unique characters in the string.*/

    public static void main(String[] args) {
       Question2 obj=new Question2();
       System.out.println("Enter the string -");
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       System.out.println("Number of unique characters - "+obj.unique(str));

    }

    public int unique(String str){
     int count=0;
     Set  m=new HashSet();
     char[] arr=str.toCharArray();
     for(int i=0;i<arr.length;i++)
     {
         m.add(arr[i]);
     }
       return m.size();

    }
}
