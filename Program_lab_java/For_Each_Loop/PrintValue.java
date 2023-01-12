

public class PrintValue {
    public static void main(String[] args) {
        System.out.println("Print value using for loop");
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Value of: " + i);
        }
        System.out.println("Print value using for each loop");
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
