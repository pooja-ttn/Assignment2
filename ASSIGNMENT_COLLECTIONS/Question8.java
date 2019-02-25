import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Q8) Write a program to format date as example "21-March-2016"
public class Question8 {
    public static void main(String[] args) {
        SimpleDateFormat def=new SimpleDateFormat("dd-MMMM-YYYY");
        String str1=def.format(new Date());
        System.out.println("Today's Date - "+str1);
    }
}
