package NestedTryBlock;

public class NestedTryBlock {
    public static void main(String[] args) throws Exception {
        try {
            try {
                System.out.println("going to divide by 0");
                System.out.println(100/0);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            int[] a = new int[2];
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
