package Odd_Even;

// https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
public class Main {

    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void isEven2(int n) {
        if ((n | 1) > n) {
            System.out.println("Is Even");
        } else {
            System.out.println("Is Odd");
        }
    }

    public static void isEven3(int n) {
        if ((n & 1) == 0) {
            System.out.println("Is Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void isEven4(int n) {
        if ((n ^ 1) == n + 1) {
            System.out.println("is Even");
        } else {
            System.out.println("Is Odd");
        }
    }

    public static void isEven5(int n) {
        if (n != 0) {
            if (Integer.toBinaryString(n).endsWith("0")) {
                System.out.println("is Even");
            } else {
                System.out.println("is odd");
            }
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        isEven(n);
    }
}
