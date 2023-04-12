package Throw;

public class Main {
    public static void display() {
        try {
            throw new ArithmeticException("Some exception throwed");
        } catch (ArithmeticException e) {
            System.out.println("inside display catch block");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (Exception e) {
            System.out.println("inside main catch block");
            System.out.println(e);
        }

    }
}
