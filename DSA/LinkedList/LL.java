package DSA.LinkedList;
public class LL {
    private static Node head;
    static class Node 
    {
        int data;
        Node next;
        // constructor
        Node(int data) 
        {
            this.data = data;
            next = null;
        }
        // another constructor
        Node(int data, Node next) 
        {
            this.data = data;
            this.next = next;
        }
    }
    public static void addAtFirst(int data)
    {
        Node Node = new Node(data);
        if (head == null) 
        {
            head = Node;
            return;
        }
        Node.next = head;
        head = Node;
    }
    public static void addAtLast(Node head,int data) {
        Node Node = new Node(data);
        if (head == null) {
            head = Node;
            return; 
        }
        Node temp = head;
        while (temp.next  != null) {
            temp = temp.next;
        }
        temp.next = Node;
    }
    public static void addAtMiddle(Node head, int data, int position) {
        if (head == null) return;
        Node node = new Node(data);
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            ++count;
        }
        node.next = temp.next;
        temp.next = node;
    }
    public static void printList(Node head) {
        if (head == null) return; // if the list is empty
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        addAtFirst(1);
        addAtLast(head, 5);
        addAtMiddle(head, 7, 3);
        printList(head);
    }
}
