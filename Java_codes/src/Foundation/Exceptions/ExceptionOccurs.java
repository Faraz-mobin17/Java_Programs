package Foundation.Exceptions;

/*
 * statement excuted
 * if no exception occurs  1,2,3,4,5,6,8,9,11,12
 * if exception is in statement 2 then ans will be 1,10,11,12
 * if exception occurs in statement - 5 ans will be 1,2,3,4,7,8,9,11,12
 * if exception occurs in statment - 5 but outer catch block is matched ans 
 * will be: 1,2,4,8,11,12 statement - 9 will not be executed outer catch block will 
 * be executed directly
 */
public class ExceptionOccurs {
    public static void main(String[] args) {
        // try {
        // statement - 1
        // statement - 2
        // statement - 3
        // try {
        // statement-4
        // statement-5
        // statement-6
        // }
        // catch(Exception e) {
        // statement-7
        // }
        // finally {
        // statement-8
        // }
        // statement-9
        // }
        // catch(Exception e) {
        // statement-10
        // }
        // finally {
        // statement-11
        // }
        // statement-12
    }
}
