import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
* Sum all the numbers greater than 5 in the integer list.
*/
public class Question10 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        int num=list.stream().filter(e-> e>5).reduce(0,(a,b)->a+b);
        System.out.println(num);

    }
}
