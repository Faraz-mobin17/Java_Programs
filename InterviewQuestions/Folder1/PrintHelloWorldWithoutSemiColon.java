package InterviewQuestions.Folder1;
/*
 * pritn hello world without using semi colon
 * Method 1 using printf method
 * Method 2 using append method
 * Method 3 using equals method
 * Method 4 using for loop
 */
public class PrintHelloWorldWithoutSemiColon {
    public static void main(String[] args) {
        // method 1
        if (System.out.printf("hello world\n") == null) {}
        // method 2
        if (System.out.append("hello world\n") == null) {}
        // method 3
        if (System.out.append("Hello World\n").equals(null)) {}
        // method 4
        for (int i = 0; i < 1; System.out.println("Hello World")) {
            ++i;
        }
    }
}
