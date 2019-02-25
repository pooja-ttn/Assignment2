/*Use isShutDown() and isTerminate() with ExecutorService.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question5 {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {


            executor.submit(new Runnable() {
                @Override
                public void run() {
                    try{
//                  Thread.sleep(1000);
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

                        System.out.println("This is thread 2");

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


