package Pattern;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int row = 1;
            int totalRows = 2 * n + 1;
            while (row <= totalRows) {
                int col = 1;
                int totalCols = row > n + 1 ?  : 2 * row - 1; 
                while (col <= totalCols) {
                    if (col == 1 || col == totalCols){ 
                        System.out.print("*");
                    }
                    System.out.println();
                    col++;
                }
                row++;
            }
        }
    }
}
