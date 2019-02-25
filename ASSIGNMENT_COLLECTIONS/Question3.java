import java.util.*;

/*Q3)
Write a method that takes a string and print the number of occurrence of each characters in the string.*/

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        Map<Character, Integer> m = new HashMap();
        for (Character c : arr) {
            if (!m.containsKey(c)) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c)+1);
            }
        }
        for (Character c :m.keySet()) {

            System.out.println(c+" occurred "+m.get(c)+" times");
        }
    }
}