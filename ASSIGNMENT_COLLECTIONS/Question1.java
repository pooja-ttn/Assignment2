import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {

    /* Write Java code to define List .
      Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
*/

    public static void main(String[] args) {
        List list=new ArrayList();
        Float sum=0.0f;
        list.add(3.4f);
        list.add(2.4f);
        list.add(5.4f);
        list.add(3.2f);
        list.add(9.0f);
        Iterator <Float>i=list.iterator();
        while(i.hasNext()){
            sum=sum + i.next();
        }
        System.out.println("Sum= "+sum);

    }
}
