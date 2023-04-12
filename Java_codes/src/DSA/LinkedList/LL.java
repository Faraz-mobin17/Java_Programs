package DSA.LinkedList;

public class LL {
    private Node head = null; // optional by default value is null
    private Node tail = null; // optional by default value is null
    private int size = 1;

    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(final int data) {
            this.data = data;
            next = null; // optional by default null
        }

        // another constructor
        public Node(final int data, final Node next) {
            this.data = data;
            this.next = next;
        }

    }

    public int getSize() {
        return size;
    }

    public void addFirst(final int data) {
        final Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(final int data) {
        // O(n)
        final Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void addLast2(final int data) {
        // O(1)
        final Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(final int data, final int position) {
        if (position == 1) {
            addFirst(data);
            return;
        }
        final Node newNode = new Node(data);
        size++;
        Node currentNode = head;
        int count = 1;
        while (currentNode != null && count < position - 1) {
            currentNode = currentNode.next;
            ++count;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            final int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        final int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is emtpy");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            final int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i += 1) {
            prev = prev.next;
        }
        final int value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public int search(final int key) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return Integer.MIN_VALUE;
    }

    public int helper(final Node head, final int key) {
        // Time complexity O(n)
        // Space complexity O(n)
        if (head == null)
            return -1;
        if (head.data == key)
            return 0;
        final int idx = helper(head, key);
        if (idx == -1)
            return -1;
        return idx + 1;
    }

    public int searchRec(final int key) {
        return helper(head, key);
    }

    public void reverseList() {
        // Time complexity O(n)
        Node current = tail = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printList() {
        if (head == null)
            return; // if the list is empty
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void printList2() {
        if (head == null)
            return; // if the list is empty
        Node currentNode = head;
        for (; currentNode != null; currentNode = currentNode.next) {
            System.out.print(currentNode.data + "->");
        }
        System.out.println("NULL");
    }

    public void printList3() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        do {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        while (currentNode != null);
        System.out.println("NULL");
    }

    public static void main(final String[] args) {
        final LL ll = new LL();
        // Node firstNode = new Node(2);
        // Node secondNode = new Node(3);
        // Node thirdNode = new Node(4);
        // head = firstNode;

        // firstNode.next = secondNode;
        // secondNode.next = thirdNode;
        // Node firstNode,secondNode,thirdNode;
        // head = firstNode;
        // firstNode = new Node(1,secondNode);
        // secondNode = new Node(2,thirdNode);
        // thirdNode = new Node(3);

        // ll.addFirst(1);
        // ll.addLast( 5);
        // ll.addMiddle( 7, 2);
        // System.out.println("display list");
        // ll.printList();
        // System.out.println("Size of LinkedList: " + LL.size);
        // ll.removeFirst();
        // System.out.println("display list");
        // ll.printList();
        // System.out.println("Size of LinkedList: " + LL.size);
        // ll.removeLast();
        // System.out.println("display list");
        // ll.printList();
        // System.out.println("Size of LinkedList: " + LL.size);
        // System.out.println(ll.search(7));
        for (int i = 1; i <= 5; i += 1) {
            ll.addFirst(i);
        }
        ll.reverseList();
        ll.printList();
    }

}
