package Foundation.Exceptions;

/*
 * will not go inside catch block only try and finally will be executed
 */
public class ExceptionSixth {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.error();
    }
}

class Demo {
    void error() {
        try {
            System.out.println("Inside try block");
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            System.out.println("Inside Catch block");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}