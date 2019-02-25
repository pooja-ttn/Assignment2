
//Q 7)Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question7 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Callable<Integer>> list1=new ArrayList<>();

        list1.add (new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });


        list1.add (new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                try{
                    Thread.sleep(1000);

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                return 2;
            }
        });

        list1.add (new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });

        list1.add (new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });

        List <Future<Integer>> list2=executorService.invokeAll(list1);
        for (Future<Integer> e:list2) {

            if(e.isDone())
            {
                try{
                    System.out.println(e.get());

                }
                catch(ExecutionException e2)
                {
                    e2.printStackTrace();
                }

            }

        }
        executorService.shutdown();

        executorService.awaitTermination(2000L,TimeUnit.MILLISECONDS);

        if(executorService.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("On or more tasks still remaining");
        }


    }
}