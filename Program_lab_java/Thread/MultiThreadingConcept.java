package Thread;

public class MultiThreadingConcept extends Thread {
    public void run() {
        for (int i = 0; i < 10; i += 1) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i += 1) {
            MultiThreadingConcept mtc = new MultiThreadingConcept();
            mtc.start();
        }
    }
}
