
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Q8) Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()

public class Question8 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running after 2 seconds");

            }
        }, 2, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("This has schedule fixed rate after every 3 seconds");
            }
        }, 2, 3, TimeUnit.SECONDS);


        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("This will give a delay of 1 second");
            }
        }, 2, 1, TimeUnit.SECONDS);
    }

}
