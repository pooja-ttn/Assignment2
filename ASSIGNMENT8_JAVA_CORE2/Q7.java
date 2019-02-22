import java.text.DecimalFormat;
import java.util.Scanner;
public class Q7 {

//     Q7. WAP to convert seconds into days, hours, minutes and seconds.

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value for seconds");
        long sec=s.nextLong();
        DecimalFormat d=new DecimalFormat("#.0");
        float min=sec/60;
        float hrs=min/60;
        float days=hrs/24;
        System.out.println("Conversion in minutes "+d.format(min)+" minutes");
        System.out.println("Conversion in hours "+d.format(hrs)+" hours");
        System.out.println("Conversion in days "+d.format(days)+" days");

    }
}
