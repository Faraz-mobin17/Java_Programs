package Collection.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(150);
        pq.add(200);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
    }
}
