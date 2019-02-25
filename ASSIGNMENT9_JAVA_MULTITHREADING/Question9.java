import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Q9) Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
*/


class Process implements Runnable{
    int id;

    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::"+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }
}

public class Question9 {
    public static void main(String[] args) {

//        ExecutorService executorService= Executors.newFixedThreadPool(4);
        ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i = 0; i <= 4; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();
    }
}

