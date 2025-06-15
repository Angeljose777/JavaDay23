// Using the Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Using the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Thread using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-Class-1");
        thread1.start(); // Always use start() to begin a new thread

        // Thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("Runnable-Thread-1");
        thread2.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
