import java.util.Scanner;
public class Q2 {

    //     2. WAP to sorting string without using string Methods?
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
            char temp;
            char[] charArray;
            charArray = str.toCharArray(); //coverting string to char array
            for (int i =0; i<charArray.length; i++) {
                for (int j = 0; j < charArray.length-1;j++ ) {
                    if (charArray[j]>charArray[j+1]){ //comparison according to ascii
                        temp=charArray[j];
                        charArray[j]=charArray[j+1];
                        charArray[j+1]=temp; //swapping values according to ascii
                    }
                }
            }



        System.out.println("Sorted string-"+new String(charArray));

    }
}