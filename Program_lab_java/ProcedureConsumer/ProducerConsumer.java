package ProcedureConsumer;

import java.util.LinkedList;

public class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() > 0) {
                    wait();
                }
                System.out.println("Produced data");
                list.add(value);
                value++;
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                    int value = list.removeFirst();
                    System.out.println("consumed data" + value);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
