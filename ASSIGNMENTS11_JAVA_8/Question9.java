import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*

Collect all the even numbers from an integer list.
*/
public class Question9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
       System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));
    }
}
