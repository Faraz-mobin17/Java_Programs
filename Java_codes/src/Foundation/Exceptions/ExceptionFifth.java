package Foundation.Exceptions;

import java.util.Scanner;
/*
 * re throwing exception using throw keyword
 */

public class ExceptionFifth {
    public static void main(String[] args) {
        System.out.println("Connection 1 established");
        Demo d1 = new Demo();
        d1.alpha();
        System.out.println("Connection 1 terminated");
    }
}

class Demo {
    void alpha() {
        System.out.println("connection 2 established");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the Numerator");
            int a = scan.nextInt();
            System.out.println("Enter the denominator");
            int b = scan.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception caught in alpha method");
            throw e; // re throwing the exception to the caller
        } finally {
            scan.close();
        }
        System.out.println("Conneciton 2 is terminated"); // this will not be executed if throw e is used
    }
}