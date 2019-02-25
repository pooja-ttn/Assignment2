
// Q13) Coordinate 2 threads using wait() and notify().

public class Question13 {

    public void worker1() {
        synchronized (this) {
            System.out.println("Worker 1 started");
            try{
// wait();
            wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("Worker 1 stopped ");
        }
    }

    public void worker2() {
        synchronized (this){

            System.out.println("Worker 2 started");
            System.out.println("Worker 2 stopped ");
            notify();
// notify();
        }
    }
}
class MainClass3{
    public static void main(String[] args) throws InterruptedException{
        Question13 obj=new Question13();
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
    }
}
