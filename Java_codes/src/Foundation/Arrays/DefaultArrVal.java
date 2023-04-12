package Foundation.Arrays;

public class DefaultArrVal {
    int[] x; // primitive reference varible 
    int[] arr = new int[3];
    static int[] arr2 = new int[2];
    public static void main(String[] args) {
        DefaultArrVal d = new DefaultArrVal();
        System.out.println(d.x); // default value is null
        System.out.println(d.x[0]); // Compile time exception: null pointer exception
        System.out.println(d.arr); // [I@e534d7
        System.out.println(d.arr[0]); // 0
        System.out.println(arr2); // [I@e534d7
        System.out.println(arr2[0]); // 0
    }
}
