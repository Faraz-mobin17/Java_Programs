package Collection.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        LinkedList list2 = new LinkedList();
        list2 = new LinkedList();
        list2.add("java");
        list2.add(1);
        list2.add(2.2);
        list2.add('C');
        System.out.println(list2);

        LinkedList list3 = new LinkedList();
        list3 = new LinkedList();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.addFirst("java");
        list3.addLast("cpp");
        System.out.println(list3);
        list3.add(2, 10);
        System.out.println(list3);

        System.out.println("Peek Method: " + list3.peek());
        System.out.println(list3.poll());
        System.out.println(list3);
        System.out.println(list3.getLast());
        System.out.println(list3.getFirst());

        System.out.println(list3);
        list3.push(10);
        System.out.println(list3);
        list3.pop();
        System.out.println(list3);
    }
}
