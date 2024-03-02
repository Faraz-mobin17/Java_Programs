package DSA.Recursion;

public class Fibo {
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = fibo(n);
        System.out.println(ans);
    }
}
