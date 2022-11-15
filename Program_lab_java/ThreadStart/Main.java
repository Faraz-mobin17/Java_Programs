package ThreadStart;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // t.start();
        t.run();
        t.setName("Faraz");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("Run method is called");
    }
}
