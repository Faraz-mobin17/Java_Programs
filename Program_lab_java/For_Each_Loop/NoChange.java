// complete java reference pg 95
// the for loop is essentially read only 
public class NoChange {
    public static void main(String[] args) {
        System.out.println();
        int nums[] = { 1, 2, 3, 4, 5 };
        for (int i : nums) {
            System.out.println(i);
            i = i * 10; // no effect on nums
        }
        System.out.println();
        for (int i : nums) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
