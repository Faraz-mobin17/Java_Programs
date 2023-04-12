package For_Each_Loop;

public class TwoD {
    public static void main(String[] args) {
        int[] nums = {5,2,8,1};
        int[] arr = new int[3];
        arr = new int[6];
        int[][] nums2 = {
            {5,2,1,3},
            {1,2,3,4},
            {3,2,1,4,4}
        };
        for (int x : nums) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("2d array");
        for (int x[] : nums2){ 
            for (int b : x) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
