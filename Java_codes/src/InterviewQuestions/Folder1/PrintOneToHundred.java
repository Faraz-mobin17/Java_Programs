package InterviewQuestions.Folder1;

public class PrintOneToHundred {
    public static void main(String[] args) {
        int one = 'A' / 'A'; // will give you 1 
        String str = ".........."; // str length is 10
        // for loop
        for (int i = one; i <= (str.length() * str.length()); ++i) {
            System.out.println(i);
        }
        // second way
        for (int i = one; i <= 'd'; ++i) {
            System.out.println(i);
        }
    }
}
