/*


Implement following functional interfaces from java.util.function using lambdas:

    (1) Consumer

    (2) Supplier

    (3) Predicate

    (4) Function

*
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    public static void main(String[] args) {

//Consumer
        Consumer<List<Integer>> consumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                {
                    System.out.println(list.get(i));
                }
            }
        };

        List<Integer>list= Arrays.asList(1,2,3,4,5,5);
        consumer.accept(list);

        //Supplier
        Supplier<List<String>> supplier=()->{
            return Arrays.asList("Pooja","Sita","Pawan");
        };
        List list2= supplier.get();
        System.out.println(list2);


        //Predicate

        Predicate<Integer> predicate=a->(a==10);
        boolean b=predicate.test(10);
        System.out.println(b);


    //Function

    Function <Integer,String>func=String::valueOf;
    String str=func.apply(10+12);
    System.out.println(str);

}}