package MultipleCatch;

public class MultipleCatchBlock1 {
    public static void main(String[] args) throws Exception {
        try {
        int a[] = new int[5];
        a[10] = 30 / 0;   
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code is executed");
    }
}
