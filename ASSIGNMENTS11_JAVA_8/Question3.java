/*Q3)

Using (instance) Method reference create and apply add and subtract method and using (Static)
 Method reference create and apply multiplication method for the functional interface created.

*/
interface myinterface{
       int multiply(int a,int b);
      }

public class Question3{
    int add(int a,int b){
        return(a+b);
    }
     int sub(int a,int b){
        return(a-b);
    }
    static int multiply(int a,int b){
       return a*b;
    }

    public static void main(String[] args) {
       myinterface obj=new Question3()::add;
        System.out.println(obj.multiply(12,6));


        myinterface obj1=new Question3()::sub;
        System.out.println(obj1.multiply(12,6));

        myinterface obj2=Question3::multiply;

        System.out.println(obj2.multiply(12,6));


    }
}

