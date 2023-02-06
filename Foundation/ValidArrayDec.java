package Foundation;

public class ValidArrayDec {
    public static void main(String[] args) {
        int[] a = new int[]; // invalid we have to specify base size
        int[] b = new int[3]; // valid base size is there
        int[][] c = new int[][]; // invalid no base size
        int[][] d = new int[3][]; //  valid base size
        int[][] e =new int[][4]; // not valid base size is not there
        int[][] f = new int[3][4]; // valid both sizes we can specify
        int[][][] i = new int[3][4][5]; // valid all 3 sizes we can specify
        int[][][] j = new int[3][4][]; // valid first 2 demisions are there
        int[][][] k = new int[3][][5]; // invalid without specifying 2d how you can define 3rd dimension
        int[][][] l = new int[][4][5]; // invalid base size is not specified
        int[][][] m = new int[3][][]; // valid base size is there
        System.out.print("hello");
    }
}
