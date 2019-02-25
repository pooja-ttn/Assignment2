import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Q3) Use a singleThreadExecutor to submit multiple threads.
public class Question3 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {


            executor.submit(new Runnable() {
                @Override
                public void run() {

                    try{
                    Thread.sleep(2000);
                    System.out.println("This is thread 1");
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
            });


            executor.submit(new Runnable() {
                @Override
                public void run() {

                    try{
                        Thread.sleep(2000);

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
            executor.shutdown();
        }

        System.out.println("Is shutdown -"+executor.isShutdown());
        System.out.println("Is terminated -"+executor.isTerminated());


    }
}

