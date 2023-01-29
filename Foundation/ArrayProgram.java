package Foundation;

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
        int[] []a,[]b // compile time error this facility is only available for first variable not fo second or other int[] []a,[]b,[]c error
        // perfectly valid 3d array declaration
        int[][][] a;
        int [][][]a;
        int a[][][];
        int[] [][]a;
        int[] a[][];
        int[] []a[];
        int[][] []a;
        int [][]a[];
        int []a[][];
    }
}
