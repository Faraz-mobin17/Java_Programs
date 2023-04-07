package Foundation.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSecond {
    public static void main(String[] args) {
        int num = 0;
        try (Scanner sc = new Scanner(System.in)) { // this is try with resources
            num = sc.nextInt(); // what if we give input as string it will throw an error so to fix this use TC
            /*
             * if we are closing it here it will execute if there is no exception but what
             * is there is an
             * exception it will jump to catch block
             */
            // sc.close(); // or you can use this to close
        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
            // sc.close() // if we close it here and if exception doesn't occur then it will
            // not be closed so
            // what to do in this case
            /*
             * you can use it both in try and catch block but there is one more way to make
             * your code
             * follow the DRY principle use the finally block it will execute always
             */
        } finally { // it will execute irrespective of exception occured or not
            // sc.close(); // closing the resources it will only work if try with resources
            // is not used
        }
        System.out.println(num);
    }
}
