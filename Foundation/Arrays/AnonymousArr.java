package Foundation.Arrays;
public class AnonymousArr {
    public static void main(String[] args) {
        sum(new int[]{10,20,30});
    }
    public static void sum(int[] x) {
        int total = 0;
        for (int n : x) {
            total += n;
        }
        System.out.println(total);
    }
}