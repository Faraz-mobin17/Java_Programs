package Thread;

public class Multi {
    public static void main(String[] args) {
        // some code
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread Started");
        for (int i = 101; i < 200; i++) {
            System.out.println(i + " ");
        }
        System.out.println("Thread 1 is completed");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 Started ");
        for (int i = 101; i < 200; i += 1) {
            System.out.println(i + " ");
        }
        System.out.println("Thread 2 is completed");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3 started");
        for (int i = 101; i < 200; i += 1) {
            System.out.println(i + " ");
        }
        System.out.println("Thread 3 is completed");
    }
}
