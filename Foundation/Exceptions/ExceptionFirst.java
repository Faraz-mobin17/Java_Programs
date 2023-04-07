package Foundation.Exceptions;

public class ExceptionFirst {

    public static void main(String[] args) {
        int num = 1;
        int num2 = 0;
        // int result = num / num2; // throw an exception
        int values[] = { 4, 5, 6, 7 };
        int result = 0;
        String name = null;
        try {
            result = num / num2;
            System.out.println("In try block"); // this will not be executed it will jump to catch block
            System.out.println(values[0]); // this is a critical statement because if we try to access values[5] it will
                                           // // throw an exception
            result = num / name.length(); // null pointer exception
        } catch (ArithmeticException e) {
            System.out.println("cannot divided by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of Bound");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (Exception obj) {
            /*
             * the below msg is the comman msg of all the exceptions occurs during the
             * program so it
             * is not a good practice to do it to solve this we make multiple catch blocks
             */
            System.out.println("Something went wrong" + obj.getMessage());
        }
        System.out.println(result);
        System.out.println("BYE");
    }
}
