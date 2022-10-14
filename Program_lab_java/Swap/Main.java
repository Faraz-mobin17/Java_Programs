package Swap;

// https://www.geeksforgeeks.org/java-program-to-swap-two-numbers/
public class Main {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a: " + a + " Value of b: " + b);
    }

    public static void swap2(int a, int b) {
        a = a + b; // 5 + 7 = 12
        b = a - b; // 12 - 7 = 5
        a = a - b; // 12 - 5 = 7
        System.out.println("value of a: " + a + " Value of b: " + b);
    }

    public static void swap3(int a, int b) {
        a = a ^ b; // 0101 ^ 0111 = 2 = 0010
        b = a ^ b; // 0010 ^ 0111 = 5 = 0101
        a = a ^ b; // 0010 ^ 0101 = 7 = 0111
        System.out.println("value of a: " + a + " Value of b: " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("Before swapping");
        System.out.println("value of a: " + a + " Value of b: " + b);
        System.out.println("after Swapping");
        swap3(a, b);
    }
}
