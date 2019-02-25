
//Q 14)  Coordinate mulitple threads using wait() and notifyAll()
public class Question14 {

    public void worker1() {
        synchronized (this) {
            System.out.println("Worker 1 started");
            try{
// wait();
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Worker 1 stopped ");
        }
    }

    public void worker2() {
        synchronized (this){

            System.out.println("Worker 2 started");
            try{
// wait();
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Worker 2 stopped ");

        }
    }


    public void worker3() {
        synchronized (this){

            System.out.println("Worker 3 started");
            try{
// wait();
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Worker 3 stopped ");

        }
    }

    public void worker4() {
        synchronized (this){

            System.out.println("Worker 4 started");
            System.out.println("Worker 4 stopped ");
            notifyAll();
// notify();
        }
    }
}
class MainClass4{
    public static void main(String[] args) throws InterruptedException{
        Question14 obj=new Question14();
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
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker3();
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker4();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
