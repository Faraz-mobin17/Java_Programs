package Factorial;

public class Main {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i += 1) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of: " + n + " " + fact(n));
    }
}
