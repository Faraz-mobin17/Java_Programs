package Foundation.Exceptions;

public class AutomaticException {
    // public static void main(String[] args) {
    // int c = 10 / 0; // exception is thrown automatically to JVM
    // }
    public static void main(String[] args) throws Exception {
        throw new ArithmeticException("/ 0"); // throwing excepiton to JVM explicityly
    }
}
