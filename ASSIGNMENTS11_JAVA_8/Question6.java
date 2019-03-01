
/*
Create and access default and static method of an interface.
*/


interface Myinterface {
    default int add(int a, int b) {
        return a + b;
    }


    static int sub(int a, int b) {
        return a - b;
    }
}


public class Question6 implements Myinterface{
    public static void main(String[] args) {
        System.out.println(Myinterface.sub(3, 1));

        System.out.println(new Question6().add(2, 4));
    }
}
