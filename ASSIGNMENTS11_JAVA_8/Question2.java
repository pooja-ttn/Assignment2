/*Q2)

Create a functional interface whose method takes 2 integers and return one integer.

*/

interface Func_Interface{

    int returnOneInt(int a,int b);

}
public class Question2 {

    public static void main(String[] args) {
        Func_Interface obj1=(a,b)->a+b;
        int c=obj1.returnOneInt(2,5);
        System.out.println("Returned integer - "+c);
    }
}
