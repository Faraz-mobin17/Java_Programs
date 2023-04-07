package Foundation.Exceptions;

public class ExceptionFourth {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -2;
        try {
            if (num2 < 0) {
                // Exception e = new ArithmeticException("Negative Number");
                Exception e = new NegativeNumberException("Negative Number found");
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Enter a valid number: " + e);
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String msg) {
        super(msg);
    }
}