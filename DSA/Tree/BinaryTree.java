package DSA.Tree;

public class BinaryTree {
    static class Node {
        private  int data;
        private  Node left,right;
        public Node(int data) 
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void printTree(Node root)
    {
        if (root == null) return;
        System.out.println("Data: " + root.data);
        if (root.left != null) {
            System.out.println("L" + root.left.data);
        }
        if (root.right != null) {
            System.out.println("L" + root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        
    }
}
