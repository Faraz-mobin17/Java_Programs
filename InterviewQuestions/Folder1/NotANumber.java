package InterviewQuestions.Folder1;
/*
 * What is NaN ? - Not a Number
 * In java,ruby,cpp,javascript,c# NaN is defined but in c it's not defined.
 */
public class NotANumber {
    public static void main(String[] args) {
        // System.out.println(2/0);     
        System.out.println(2.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
        double nan = 2.0 % 0.0; // NaN
        System.out.println(nan);
        System.out.println((2.0%0.0) == nan);
        System.out.println(nan == nan);
    }
}
