package DSA.Tree;
public class Solution {
    static Node prev;
    static Node head;
    static class Node {
        int data;
        public Node left;
        public Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public static void printList(Node root) {
            while (root != null) {
                System.out.println("data " + root.data);
                root = root.right;
            }
        }
        public static Node btoLL(Node root) {
            if (root == null) return null;
            if (prev == null) 
            {
                head = root;
            }
            else {
                root.left = prev;
                prev.right = root;
            }
            prev = root;
            btoLL(root.right);
            return head;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(2);
        Node.printList(root);
    }
}
