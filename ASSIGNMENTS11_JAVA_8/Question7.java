/*
 Override the default method of the interface.
*/



interface Myinterface1 {
default void print1(){
    System.out.println("This is interface default method");
}
}


public class Question7 implements Myinterface1{

     public void print1(){
        System.out.println("This is class override default method");
    }
    public static void main(String[] args) {
        System.out.println(Myinterface.sub(3, 1));
        new Question7().print1();
    }
}