import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Q4) Try shutdown() and shutdownNow() and observe the difference.
public class Question4 {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {


            executor.submit(new Runnable() {
                @Override
                public void run() {

                    try{
//                    Thread.sleep(1000);
                        System.out.println("This is thread 1");
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                }
            });


            executor.submit(new Runnable() {
                @Override
                public void run() {

                    try{
                        Thread.sleep(1500);

                        System.out.println("This is thread 2");
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        }
        finally {
            executor.shutdownNow();
//            shutdownNow() will shutdown  or cancel the alrady submitted thread. ie(Thread2 here)
        }


        System.out.println("Is shutdown -"+executor.isShutdown());
        System.out.println("Is terminated -"+executor.isTerminated());

        ExecutorService executor1 = Executors.newSingleThreadExecutor();


        try {


            executor1.submit(new Runnable() {
                @Override
                public void run() {

                    try{
//                    Thread.sleep(1000);
                        System.out.println("-------------------------------------------------------------------------------------------------");

                        System.out.println("This is thread 1");
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                }
            });


            executor1.submit(new Runnable() {
                @Override
                public void run() {

                    try{
                        Thread.sleep(1000);

                        System.out.println("This is thread 2");
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        }
        finally {
            executor1.shutdown();
//            shutdown() will reject the new tasks while executing the already submitted thread.
        }



        System.out.println("Is shutdown -"+executor1.isShutdown());
        System.out.println("Is terminated -"+executor1.isTerminated());



    }


}
