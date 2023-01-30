package Foundation;

public class ArrayInit {
    public static void main(String[] args) {
        int[][] x = new int[3][2];
        
        System.out.println(x); // [[I@something
        System.out.println(x[0]); // [I@something
        System.out.println(x[0][0]);  // 0  
        int[] y = new int[2];
        
        System.out.println(y); // [I@something
        System.out.println(y[0]); // 0
        
        int[][] z = new int[2][];
        System.out.println(z); // [[I@something
        System.out.println(z[0]); // null
        System.out.println(z[0][0]); // null pointer exception because we are performing operation

        
    }
}
