package DSA.Stack;

import java.util.Stack;
import java.util.Scanner;

public class ValidParenthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i += 1) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                // closing brackets
                if (st.size() == 0)
                    return false;
                if (st.peek() == ')')
                    st.pop();
            }
        }
        if (st.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(isBalanced(str));
        }
    }
}
