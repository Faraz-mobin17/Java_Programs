package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("List: " + list);
        System.out.println("List contains: " + list.contains(200));
        System.out.println("Index: " + list.indexOf(200));
        System.out.println("Size: " + list.size());
        list.ensureCapacity(10); // ensures minimum capacity
        list.trimToSize(); // remove extra space 
        System.out.println("Size: "+ list.size());
        System.out.println("Clearig array");
        list.clear(); // made array empty

        List al = new ArrayList(); // parent type reference
        al.add(100);
        // ArrayList list2 = new ArrayList();
        // list2.add("Pw skills");
        // list2.add("Java");
        // list2.add(1);
        // list2.add(2.2);

        // System.out.println("List 2: " + list2);

        // ArrayList list3 = new ArrayList();
        // list3.add(1);
        // list3.add(2);
        // list3.add(4);
        // System.out.println("List 3: " + list3);
        // list3.addAll(list2);
        // System.out.println("List 3: " + list3);

        // list3.add(2,"CPP");
        // System.out.println(list3);
    }
}
