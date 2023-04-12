package InterviewQuestions.Folder1;
/*
 * will static block be executed with final variable 
 * the output with final will be 100 and static block will not be executed because to improve
 * performance internally java will replace Main.x will 100 you can see it when you decompile .main class file
 * Main class will not be executed.
 * without final modifier static block will be executed 
 */
public class WhichBlock {
    public static void main(String[] args) {
        System.out.println(Main.value);
    }
}

class Main {
    public static final int value = 100; // try removing final and re run the code
    static {
        System.out.println("main class -- static block");
    }
}
