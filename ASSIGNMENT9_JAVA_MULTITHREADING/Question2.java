
/* Q2) Use sleep and join methods with thread. */

public class Question2 {

    public static void main(String[] args) throws InterruptedException{

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                    System.out.println("This is thread 1");

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });



        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    System.out.println("This is thread 2");

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
thread1.start();
thread2.start();
thread1.join();
thread2.join();
System.out.println("Main will execute at the end");

    }
}
