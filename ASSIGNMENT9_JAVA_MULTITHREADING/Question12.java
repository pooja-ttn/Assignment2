
//Q12) Use Atomic Classes instead of Synchronize method and blocks.

import java.util.concurrent.atomic.AtomicInteger;

public class Question12 {
    AtomicInteger count=new AtomicInteger();  //AtomicInteger

    public void incrementCount() {
        synchronized (this) {
            count.incrementAndGet();
        }
    }
    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();

        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
}
class MainClass2{
    public static void main(String[] args) throws InterruptedException{
        Question12 obj=new Question12();
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
        thread1.join();
        thread2.join();
        System.out.println(obj.count);
    }
}

