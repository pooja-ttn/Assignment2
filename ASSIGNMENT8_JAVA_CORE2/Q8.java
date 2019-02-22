
/* Q8. WAP to read words from the keyboard until the word done is entered.
For each word except done, report whether its first character is equal to  its last character. For the required loop, use a
a)while statement
b)do-while statement*/

import java.util.Scanner;

//Using while loop-

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the words");
        String str = s.next();
        while (!str.equals("done")) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("First character is equal to last character");
            } else {
                System.out.println("First character is not equal to last character");

            }
            str = s.next();
        }
        int a = 0;
        System.out.println("Press 1 for using Do-While loop");
        a = s.nextInt();
        if (a == 1) {
            Q81 obj = new Q81();
            obj.show();

        } else {
            System.exit(0);
        }
    }
}



//Using Do-While loop-

 class Q81 {

        void show(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the words");
        String str;
        do
        { str=s.next();
            if(str.charAt(0)==str.charAt(str.length()-1))
            {

                System.out.println("First character is equal to last character");
            }
            else
            {
                System.out.println("First character is not equal to last character");

            }

        }
        while(!str.equals("done"));
    }
    }
