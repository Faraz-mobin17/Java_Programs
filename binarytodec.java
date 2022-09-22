import java.util.*;
import java.lang.*;
class BinaryToDecimal {
    public static void main(String args[]) {
//        int n = 53;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: " );
        int n = sc.nextInt();
        int step = 1;
        while (n != 1) {
           if (n % 2 == 0) {
                n = n / 2;
                System.out.println("Step: " + step + " When Number is Even: " + n);
            } else {
               n = 3 * n + 1;
               System.out.println("Step: " + step + " When Number is Odd: " + n);
           }
            step++;
        }
    }
}
