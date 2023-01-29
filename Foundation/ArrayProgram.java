/*
 * array declaration syntax
 */
public class ArrayProgram {
    public static void main(String[] args) {
        int[] a,b; // a -> 1, b -> 1
        int[] a[],b; // a -> 2, b -> 1
        int[] a[],b[]; // a-> 2, b-> 2
        int[] []a,b; // a-> 2 b->2
        int[] []a,b[]; // a->2,b->3
    }
}
