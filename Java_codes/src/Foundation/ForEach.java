package Foundation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i += 1) {
            list.add(i);
        }
        System.out.println("list: " + list);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5); // another way to create list
        System.out.println(list2);
        for (Integer i : list2) { // enhanced for loop to print elements in the list
            System.out.println(i);
        }
        list.forEach(e -> System.out.println(e)); // printing data using lamda expression
    }
}
