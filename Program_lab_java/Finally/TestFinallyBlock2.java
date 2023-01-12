package Finally;

public class TestFinallyBlock2 {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("exception handled");
            System.out.println(e);
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("rest of the code is executed");
    }
}
