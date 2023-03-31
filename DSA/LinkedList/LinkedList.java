package DSA.LinkedList;

public class LinkedList {
    private int length;
    ListNode head,tail;
    public LinkedList() {
        length = 0;
    }
    public synchronized ListNode getHead() {
        return head;
    }
    public synchronized void insertAtBegin(ListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }
    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        }
        else {
            ListNode current,next;
            for (current = head; (next = current.getNext()) != null; current = next) {
               current.setNext(node); 
            }
        }
        length++;
    }
}
