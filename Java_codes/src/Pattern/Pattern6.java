package Pattern;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the Number of Rows");
            int n = input.nextInt();
            int i = 1;  
            int sum = i;
            while (i <= n) {
                int t = 1;
                int j = 1;
                while (j <= i) {
                    if (t < i) {
                        System.out.print(t + "+");
                        t++;
                        j++;
                    } else {
                        System.out.print(t + "=" + sum);
                        j++;
                    }
                }
                System.out.println();
                i++;
                sum += i;
            }
        }
    }
}
