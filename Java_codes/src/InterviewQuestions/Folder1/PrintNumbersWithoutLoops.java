package InterviewQuestions.Folder1;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoops {
    /*
     * print 1 to 100 without using loops
     * 1. using recursion
     * 2. using java Streams
     */
    public static void main(String[] args) {
        // print(1);
        // printNum(1);
        // printNumber(1, 100);
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }
    public static void print(int n) {
        if (n == 101) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
    public static void printNum(int num) {
        if (num <= 100) {
            System.out.println(num);
            num++;
            print(num);
        }
    }
    public static void printNumber(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            start++;
            printNum(start);
        }
    }
}
