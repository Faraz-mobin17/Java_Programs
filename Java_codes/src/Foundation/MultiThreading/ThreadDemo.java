package Foundation.MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Child Thread");
        }
    }

}

class Thread2 implements Runnable {
    @Override
    public void run() {
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 1; i <= 5; i += 1) {
            System.out.println("Main thread");
        }
        System.out.println("Outside main for loop");
    }
}