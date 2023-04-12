package Collection.ArrayDeque;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast(20);
        System.out.println(ad);

        ad.add("java");
        System.out.println(ad);

        ad.offer(500); // it may insert or not
        ad.offerFirst(10);
        ad.offerLast(1);
        System.out.println(ad);
    }
}
