
//Q10) Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.
class Question10 {

    int count;

   synchronized public void incrementCount() {
        count++;
    }           //synchronize method


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
class MainClass{
    public static void main(String[] args) throws InterruptedException{
        Question10 obj=new Question10();
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

