

// complete java reference pg 95
// for each loop on 2D array
public class OverMultiDArray {
    public static void main(String[] args) {
        System.out.println();
        int sum = 0;
        int[][] nums = new int[3][5];
        // give nums some value
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] i : nums) {
            for (int j : i) {
                System.out.println("Value of j is: " + j);
                sum += j;
            }
        }
        System.out.println("SUM: " + sum);
    }
}
