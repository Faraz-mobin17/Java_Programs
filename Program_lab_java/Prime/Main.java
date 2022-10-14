package Prime;

public class Main {

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
