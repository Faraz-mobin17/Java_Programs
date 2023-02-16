package Pattern;
/*
 * This code uses two nested for loops to print the pattern. 
 * The first loop iterates through each row and the second loop prints the numbers in each row.
 *  The nums array holds the numbers to be printed in each row. 
 * The inner loop starts from i and goes up to n to print the first part of the row, 
 * and then it starts from 0 to i - 1 to print the second part of the row. 
 * The n variable determines the number of rows in the pattern.
 */
public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int[] nums = {1, 3, 5, 7};
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(nums[j]);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(nums[j]);
            }
            System.out.println();
        }
    }
}
