package DSA.Tree;

public class BinaryTree {
    static class Node {
        private final int data;
        private Node left;
        private Node right;
        public Node(int data) 
        {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public void printTree(Node root)
    {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;
    }
}
