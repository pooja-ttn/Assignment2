import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/*

Q7) Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
isFull()and an additional operation getMin() which should return minimum element from the SpecialStack.
(Expected complexity ­ O(1))

*/

    class SpecialStack {
        private final int MAXSIZE = 100;
        private int minimum = Integer.MAX_VALUE;
        private final LinkedList<Integer> stack = new LinkedList<>();

        public void push(int element){
            if(element < minimum){
                minimum = element;
            }
            stack.push(element);
        }
        public int pop(){
            return stack.pop();
        }
        public boolean isFull(){
            return (stack.size() == MAXSIZE);
        }
        public boolean isEmpty(){
            return (stack.size() == 0);
        }
        public int getMin(){
            minimum= Collections.min(stack);
            return minimum;
        }
        public int getSize()
        {
            return stack.size();
        }


        @Override
        public String toString() {
            return stack.toString();
        }
    }

    public class Question7{
        public static void main(String[] args) {
            SpecialStack s = new SpecialStack();

            System.out.println("Stack : " + s);

            System.out.println("Is Empty: " + s.isEmpty());

            s.push(5);
            s.push(10);
            s.push(3);
            s.push(20);
            s.push(7);

            System.out.println("Stack : " + s);

            System.out.println("Popped: " + s.pop());
            System.out.println("Popped: " + s.pop());

            System.out.println("Is Full: " + s.isFull());

            System.out.println("Is Empty: " + s.isEmpty());

            System.out.println("Minimum Element: " + s.getMin());
            System.out.println("Popped: " + s.pop());
            System.out.println("Size: " + s.getSize());


            System.out.println("Stack : " + s);

        }
    }






