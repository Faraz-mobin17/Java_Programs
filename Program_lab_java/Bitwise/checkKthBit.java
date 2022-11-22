package Bitwise;

public class checkKthBit {
    static boolean checkKbit2(int n, int k) {
        int x = (1 << (k - 1));
        if ((n & x) != 0)
            return true;
        else
            return false;
    }

    static boolean checkKbit(int n, int k) {
        int x = 1;
        for (int i = 0; i < k - 1; i += 1) {
            x = x * 2;
        }
        if ((n & x) != 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean ans = checkKbit2(4, 2);
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
