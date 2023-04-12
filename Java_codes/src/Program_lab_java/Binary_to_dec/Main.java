package Binary_to_dec;

public class Main {
    public static void main(String[] args) {
        int n = 1101;
        int sum = 0, i = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 1) {
                sum += Math.pow(2, i);
            }
            n /= 10;
            i++;
        }
        System.out.println(sum);
    }
}
