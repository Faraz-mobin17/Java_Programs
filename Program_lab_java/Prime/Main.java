package Prime;

public class Main {

    public static boolean isPrime3(int n) {
        // Check if n=1 or n=0
        if (n <= 1)
            return false;
        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;
        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;

    }

    public static boolean isPrime2(int n) {
        for (int i = 2; i < Math.sqrt(n); i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }
}
