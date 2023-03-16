package Foundation.Arrays;

public class ArrayValidTypes {
    public static void main(String[] args) {
        int[] x = {10,20,30};
        char[] ch = {'a','b','c','d'}; // works fine;
        int[] anotherArr = x;
        int[] c = ch; // give you error 
        /*
         * because char[] is an object of [C and int[] is an object of [I and there is no relation between them
         * so how one class type can be promoted to another class type. Element level promotion not applicable 
         * to arrays
         */

         String[] s = {"A","B","C"};
         Object[] o = s; // valid because child class be promoted to parent. like int[] can be promoted to Number[]

         int[] a = {10,20,30,40,50,60};
        int[] b= {70,80};
        a = b;
        b = a;
        /*
         * when ever we reassing arr elements won't be copied
         * ref var is reassign
         */
        int[][] TwoDarr = new int[3][];
        TwoDarr[0] = new int[4][3]; // error incompatible types found: 2d int arr, required: 1d arr
        TwoDarr[0] = 10; // invalid ct error incompatible types found int required: int[]
        TwoDarr[0] = new int[2]; // perfectly valid
        TwoDarr[0] = {10}; // error 
        /*
         * NOTE: whenever we assing one array to another
         * array dimensions and types must be matched but
         * sizes are not required to match
         */
        // ================================
        /*
         * Q.1 How many object got created ?
         * Ans: 12
         * Q.2 How many Objects eligible for garbage Collector
         * Ans: 7
         */
        int[][] arr = new int[4][3]; // 5 Objects
        arr[0] = new int[4]; // 1 Objects
        arr[1]  = new int[2]; // 2 Objects
        arr = new int[3][2]; // 4 Objects
    }
}
