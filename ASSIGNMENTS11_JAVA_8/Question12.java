import java.util.Arrays;
import java.util.List;

/*
Find the first even number in the integer list which is greater than 3.
*/
public class Question12 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,65,6,7,8,11);
        System.out.println(list.stream().filter(e->e%2==0 && e>3).findFirst().get());
    }
}
