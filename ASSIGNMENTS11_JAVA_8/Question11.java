import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Find average of the number inside integer list after doubling it.
*/
public class Question11 {
    public static void main(String[] args) {
        List <Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(  list.stream().collect(Collectors.averagingInt((e)->e*2))  );


//        System.out.println( list.stream().map(e->e*2).collect(Collectors.averagingInt(Integer::intValue)) );
    }
}
