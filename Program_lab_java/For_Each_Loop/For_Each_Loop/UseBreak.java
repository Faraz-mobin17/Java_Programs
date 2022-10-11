package For_Each_Loop;

// complete java reference page no 94
public class UseBreak {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : nums) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
}
