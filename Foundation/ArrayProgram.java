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
        // valid array syntax
        int[] z = new int[0];
        int[] d = new int['a'];
        byte bb = 20;
        int[] e = new int[bb];
        short s = 30;
        int[] ss = new int[s];
        int[] range = new int[2147483647]; // how many bytes will be allocated = 2147483647 * 4 bytes if this much memory is not available in our system then we will get out of memory error
        // invalid array syntax
        int[] x = new int[-3]; // runtime exception negative array size exception
        int[] l = new int[10l]; // invalid syntax only byte, short , char and int are allowed if any other type then we will get compile time error 
        int[] range2 = new int[2147483648]; // compile time error integer number too large
    }
}
