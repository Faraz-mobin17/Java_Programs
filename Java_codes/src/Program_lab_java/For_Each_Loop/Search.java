

// complete java ref pg 97
// search an array using for each loop
public class Search {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = { 1, 2, 3, 4, 5 };
        int find = 3;
        boolean found = false;
        for (int i : nums) {
            if (i == find) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value Found");
        } else {
            System.out.println("not found");
        }
    }
}
