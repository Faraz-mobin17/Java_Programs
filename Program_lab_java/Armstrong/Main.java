package Armstrong;

public class Main {
    public static void main(String[] args) {
        int temp, lastDigit, cube;
        for (int i = 100; i <= 999; i += 1) {
            cube = 0;
            temp = i;
            while (temp > 0) {
                lastDigit = temp % 10;
                cube = cube + (lastDigit * lastDigit * lastDigit);
                temp /= 10;
            }
            if (cube == i) {
                System.out.println(i + " is an Armstrong Number");
            }
        }
    }
}
