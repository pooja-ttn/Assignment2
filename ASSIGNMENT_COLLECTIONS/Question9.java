
// Q9) Write a program to display times in different country format.

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {

    public static void main(String[] args) {

        Locale loc =new Locale("da","DK");
        Locale loc1=new Locale("US","US");
        DateFormat def=DateFormat.getDateInstance(DateFormat.DEFAULT,loc);
        String date1=def.format(new Date());
    System.out.println("Date in Denmark- "+date1);
        DateFormat def1=DateFormat.getDateInstance(DateFormat.DEFAULT,loc1);
        String date2=def1.format(new Date());
    System.out.println("Date in US-     "+date2);
        Locale loc2=new Locale("in","IND");
        DateFormat def3=DateFormat.getDateInstance(DateFormat.DEFAULT,loc2);
        String date3=def3.format(new Date());
        System.out.println("Date in India-  "+date1);


    }
    }



