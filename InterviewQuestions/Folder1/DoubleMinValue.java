package InterviewQuestions.Folder1;

public class DoubleMinValue {
    public static void main(String[] args) {
        /*
         * What is the value of double MIN_VALUE ?
         * Which one is bigger Double min value or 0.0d
         * which one is bigger Double min value or negative infinity
         */
        System.out.println(Double.MIN_VALUE); // +ve no
        System.out.println(Long.MIN_VALUE); // -ve no
        System.out.println(Integer.MIN_VALUE); // -ve no
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); 
        System.out.println(Math.min(Integer.MIN_VALUE, 0)); 
        System.out.println(Float.MIN_VALUE);  // is a +ve no
        System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); 
        System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));

    }
}
