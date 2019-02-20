import java.text.DecimalFormat;
import java.util.Scanner;
public class Q4 {

//    Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int lw=0,up=0,digits=0,special=0;

        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
               lw++;
            }
            else
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                {
                    up++;
                }
                else if(str.charAt(i)<='9' && str.charAt(i)>='0') {
                    digits++;
        }
        else{
            special++;

        }
        }
        DecimalFormat df=new DecimalFormat("#.00");/*This wasn't asked in the question.Did this just to format float value to 2 precision.*/

        System.out.println("Number of lowercase= "+lw+"                Percentage of lowercase= "+df.format((float)lw*100/len)+"%");
        System.out.println("Number of uppercase= "+up+"                 Percentage of uppercase= "+df.format((float)up*100/len)+"%");
        System.out.println("Number of digits= "+digits+"                    Percentage of digits= "+df.format((float)digits*100/len)+"%");
        System.out.println("Number of special characters= "+special+"        Percentage of special= "+df.format((float)special*100/len)+"%");

    }
}
