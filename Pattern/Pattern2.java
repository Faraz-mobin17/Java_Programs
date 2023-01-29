package Pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int row = 1;
            while (row <= n) {
                int col = 1;
                int spaces = 1;
                while (spaces <= row - 1) {
                    System.out.print(" ");
                    spaces++;
                }
                while (col <= n) {
                    System.out.print("🐂");
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    }
}
