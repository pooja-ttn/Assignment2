
import java.util.*;

/*  Q6)
    Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print
    the one which came first.
     */

class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter the 7 numbers");
        Scanner s = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = s.nextInt();
        }


        Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
        for (Integer i : arr) {
            if (!m.containsKey(i)) {
                m.put(i, 1);
            } else {
                m.put(i, m.get(i) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -(o1.getValue().compareTo(o2.getValue()));
            }
        });


        Map<Integer, Integer> m1 = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> i1 : list) {
            m1.put(i1.getKey(), i1.getValue());
        }
        System.out.println(m1);
    }
}