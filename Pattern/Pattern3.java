package Pattern;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int n = input.nextInt();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
