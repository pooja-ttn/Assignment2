

public class Q7 {
//     Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

    static int  age=21;

    public static void main(String[] args) {

        System.out.println("Joshi");
        System.out.println("Age -"+age);
    }


    static {
        System.out.print("Pooja ");
    }
    //Static block runs before Static method irrespective of its position

}
