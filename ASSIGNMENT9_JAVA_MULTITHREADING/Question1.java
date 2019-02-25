
/* Q1) Create and Run a Thread using Runnable Interface and Thread class. */

    class RunnClass implements Runnable{
        @Override
        public void run()
        {
            System.out.println("Thread using Runnable");
        }
    }


class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

public class Question1
{
    public static void main(String[] args) {
        new Thread(new RunnClass()).start();
        new ThreadClass().start();
    }
}