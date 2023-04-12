package InterviewQuestions.Folder1;
/*
 * Compare two integer (Integer Caching)
 */
public class CompareTwoInt {
    public static void main(String[] args) {
        /*
         *  -128 to 127
         *  if we compare outside the range it will give false and this is known as
         * integer caching
         */
        Integer num1 = 100;
        Integer num2 = 100;
        if (num1 == num2) {
            System.out.println("they both are equal");
        } else {
            System.out.println("They both are not equals");
        }
    }
}
