package Collection.Genrics;

import java.util.ArrayList;
import java.util.Collections;

public class Genrics5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i += 1) {
            list.add(i);
        }
        System.out.println(list);
        Collections.sort(list);
        int idx = Collections.binarySearch(list, 2);
        System.out.println("Index of element: " + idx);

        Collections.rotate(list, 3);
        System.out.println("Rotated list: " + list);
        Collections.shuffle(list);
        System.out.println(list);

        for (int i = 1; i <= 5; i += 1) {
            list.add(i);
        }
        int freq = Collections.frequency(list, 1);
        System.out.println(freq);
    }
}
