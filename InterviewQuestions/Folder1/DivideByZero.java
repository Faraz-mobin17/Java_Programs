package InterviewQuestions.Folder1;
/*
 * what will be the output when you divide the number by 0
 * Number = Integer, Double, Float
 */
public class DivideByZero {
    public static void main(String[] args) {
        // Airthmetic exception
        System.out.println(9/0);
        // Infinity
        System.out.println(9.0/0);
        System.out.println(12.55f/0);
        System.out.println(10/0.0);
        System.out.println(19.99999d / 0.0);
        System.out.println(0/0); 
        System.out.println(12.33 / 0.0);
        // NaN 
        System.out.println(0.0/0); 
        System.out.println(0.0/0.0); 
    }
}
