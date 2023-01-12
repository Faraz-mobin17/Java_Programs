package Exceptional_handling;

public class ArrayIndexOutOfBound {
    
    public static void  main(String[] args) throws Exception {
        try {
            int[] a = new int[5];
            System.out.println(a[20]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
