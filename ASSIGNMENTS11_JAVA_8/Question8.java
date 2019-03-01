/*
 Implement multiple inheritance with default method inside  interface.
*/
interface MyInterface1{
   default void print1(){
     System.out.println("This is Default of Interface1");
   }

}

interface MyInterface2{
    default void print1(){
        System.out.println("This is Default of Interface2");
    }

}
public class Question8 implements MyInterface1,MyInterface2
{ @Override
 public void print1(){
    System.out.println("Overridden method in MainClass");
    MyInterface2.super.print1();

}

    public static void main(String[] args) {
new Question8().print1();
    }
}
