public class Q3 {

    //     3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

    public void NoClassDefFoundErrorMethod() {
        throw new NoClassDefFoundError();

    }

    public void ClassNotFound() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.NoClassDefFoundErrorMethod();  //To see ClassNotFoundException Comment this and uncomment the try-catch block

        /*
try{
obj.ClassNotFound();
}
catch(Exception e)
{
    e.printStackTrace();
}

    */


    }
}