import java.util.Scanner;
public class Q2 {
//     Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
;
        System.out.println("Enter the string");
        String str=s.nextLine();
        String arr[]=str.split("[\\s.]+");

        for(int i=0;i<arr.length;i++)
        {
            int count = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].equalsIgnoreCase(arr[i]))
                {
                    count = count + 1;
                    arr[j] = "0";
                }
            }
            if(!(arr[i].equals("0")))
                System.out.println(arr[i] + " : " + count);

        }

    }
}
