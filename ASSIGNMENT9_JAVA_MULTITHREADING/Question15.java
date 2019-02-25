import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//Q 15) Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
public class Question15 {
    Lock lock=new ReentrantLock();
    Condition condition =lock.newCondition();


             public void worker1() {
                        try{ lock.lock();
                            System.out.println("Worker 1 started");

                            condition.await();
                            System.out.println("Worker 1 stopped ");

                        }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            finally {
            lock.unlock();
        }}


         public void worker2() {
            try{
                lock.lock();
                System.out.println("Worker 2 started");
                System.out.println("Worker 2 stopped");
                condition.signal();
            }
            finally {
                lock.unlock();
            }
    }



}
class MainClass5 {
    public static void main(String[] args) throws InterruptedException {
        Question15 obj = new Question15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker2();
            }
        });


        thread1.start();
        thread2.start();


    }
}