package Trailing_Zeros;

public class Main {
    public static int count_Zeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i += 1) {
            fact *= i;
        }
        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact /= 10;
        }
        return count;
    }

    public static int count(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i += 1) {
            fact *= i;
        }
        int count = 0;
        while (fact > 0) {
            if (fact % 10 == 0)
                count++;
            fact /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = count(8);
        int answer = count_Zeros(8);
        System.out.println(ans);
        System.out.println(answer);
    }
}
