package DSA.Tree;

public class Height {
    static class Node {
         int data;
         Node left,right;
        public Node(int data) 
        {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int height(Node node)
    {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Node root_node = new Node(150);
        root_node.left = new Node(250);
        root_node.right = new Node(270);
        root_node.left.left = new Node(320);
        root_node.left.right = new Node(350);
        int ans = height(root_node);
        System.out.println(ans);
    }
}
