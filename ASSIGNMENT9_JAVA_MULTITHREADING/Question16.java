
//Q 16)Create a deadlock and Resolve it using tryLock().

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question16 {
    Lock lock = new ReentrantLock();
    Lock lock2 = new ReentrantLock();
/*
    public void worker1() {

            lock.lock();
            System.out.println("Worker 1 started");
            lock2.lock();
            System.out.println("Worker 1 stopped ");
            lock.unlock();
            lock2.unlock();
        }


    public void worker2() {

        lock2.lock();
        System.out.println("Worker 2 started");
        lock.lock();
        System.out.println("Worker 2 stopped");

        lock2.unlock();
        lock.unlock();
    }*/

    //Commented codes show Dealock created and resolving deadlock is given below-
    public void acquireLock(Lock lock1, Lock lock2) {
        boolean AcquireLock1 =lock1.tryLock();
        boolean AcquireLock2=lock2.tryLock();
        if(AcquireLock1 &&AcquireLock2 )
        {
            return ;
        }
        if(AcquireLock1)
        {
            lock1.unlock();
        }
        if(AcquireLock2){
            lock2.unlock();
        }

    }

    public void worker1() {

        acquireLock(lock,lock2);
        System.out.println("Worker 1 started");
        System.out.println("Worker 1 stopped ");
        lock.unlock();
        lock2.unlock();
    }


    public void worker2() {

        acquireLock(lock,lock2);
        System.out.println("Worker 2 started");
        System.out.println("Worker 2 stopped");
        lock2.unlock();
        lock.unlock();
    }

}
class MainClass6 {
    public static void main(String[] args) throws InterruptedException {
        Question16 obj = new Question16();
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


