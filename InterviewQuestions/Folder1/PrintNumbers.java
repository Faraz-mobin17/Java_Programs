package InterviewQuestions.Folder1;

import java.util.Arrays;
import java.util.BitSet;

/*
 * print numbers 1 to 100 without using for loop or recursion.
 * 1. array fill method
 * 2. Bitset class
 */
public class PrintNumbers {
    public static void main(String[] args) {
        // array fill
        Object[] num = new Object[100];
        Arrays.fill(num,new Object() {
            int count = 0;
            @Override 
            public String toString() {
                return Integer.toString(++count);
            }
        });   
        System.out.println(Arrays.toString(num));
        System.out.println();
        System.out.println();
        System.out.println();
        // method 2. bitset 
        String store = new BitSet(){{set(1,101);}}.toString();
        System.out.append(store,1,store.length());
    }
}
