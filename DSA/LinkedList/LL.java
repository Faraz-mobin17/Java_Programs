package DSA.LinkedList;

public class LL {
    private static Node head = null;
    private static Node tail = null;
    private static int size = 1;

    public static class Node 
    {
        int data;
        Node next;
        // constructor
        public Node(int data) 
        {
            this.data = data;
            next = null;
        }
        // another constructor
        public Node(int data, Node next) 
        {
            this.data = data;
            this.next = next;
        }
    }
    public void addFirst(int data)
    {
        final Node newNode = new Node(data);
        if (head == null) 
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) 
    {
        // O(n)
        final Node newNode = new Node(data);
        size++;
        if (head == null) 
        {
            head = newNode;
            return; 
        }
        Node temp = head;
        while (temp.next  != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addLast2(int data)
    {
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
    public void addMiddle(int data, int position) 
    {
        if (position == 1)
        {
            addFirst(data);
            return;
        }
        final Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) 
        {
            temp = temp.next;
            ++count;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst()
    {
        if (size == 0) 
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } 
        else if (size == 1) 
        {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
    public int removeLast()
    {
        if (size == 0)
        {
            System.out.println("Linked list is emtpy");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        
        Node prev = head;
        for (int i = 0; i < size - 2; i += 1)
        {
            prev = prev.next;
        }
        int value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }
    public int search(int key)
    {
        Node temp = head;
        int index = 0;
        while (temp != null)
        {
            if (temp.data == key)
            {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return Integer.MIN_VALUE;
    }
    public int helper(Node head,int key)
    {
        // Time complexity O(n)
        // Space complexity O(n)
        if (head == null) return -1;
        if (head.data == key) return 0;
        int idx = helper(head, key);
        if (idx == -1) return -1;
        return idx + 1;
    }
    public int searchRec(int key)
    {
        return helper(head,key);
    }
    public void reverseList()
    {
        // Time complexity O(n)
        Node current = tail = head;
        Node prev = null;
        Node next;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList() {
        if (head == null) return; // if the list is empty
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        LL ll = new LL();
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

        ll.addFirst(1);
        ll.addLast( 5);
        ll.addMiddle( 7, 2);
        System.out.println("display list");
        ll.printList();
        System.out.println("Size of LinkedList: " + LL.size);
        ll.removeFirst();
        System.out.println("display list");
        ll.printList();
        System.out.println("Size of LinkedList: " + LL.size);
        ll.removeLast();
        System.out.println("display list");
        ll.printList();
        System.out.println("Size of LinkedList: " + LL.size);
        System.out.println(ll.search(7));
        for (int i = 8; i <= 12; i += 1) {
            ll.addFirst(i);
        }
        ll.reverseList();
        ll.printList();
    }
}
