package Pattern;
public class Pattern7 {

        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print first half of the pattern
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Print second half of the pattern
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print first half of the pattern
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Print second half of the pattern
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    

