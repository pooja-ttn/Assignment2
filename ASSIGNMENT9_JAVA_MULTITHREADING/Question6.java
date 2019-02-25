
/*
    Q6) Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object
     to know the status of task submitted.
 */

import java.util.concurrent.*;

public class Question6 {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executor= Executors.newSingleThreadExecutor();

        Future<Integer> future1=executor.submit(new Callable<Integer>() {
            @Override
            public Integer call()throws Exception{

                return 2;
            }
        });

        executor.shutdown();
        if(future1.isDone())
        {
            System.out.println(future1.get());
        }

        if(future1.isCancelled()) {
            System.out.println("Is Cancelled- " + future1.isCancelled());
        }
    }  }


