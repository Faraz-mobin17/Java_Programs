package Teena.Even_Odd;

import java.util.*;

public class Main {

    public static boolean isPrime() { // true or false
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = input.nextInt();
        for (int i = 2; i < n; i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        // boolean result = isPrime();

        // if (result) {
        // System.out.println("is Prime");
        // } else {
        // System.out.println("not prime");
        // }
        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();
        for (i = 2; i < n;) {
            if (n % i == 0) {
                System.out.println("Not prime");
                break;
            } else {
                System.out.println("prime");
                break;
            }
        }
    }
}
