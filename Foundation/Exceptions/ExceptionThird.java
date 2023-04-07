package Foundation.Exceptions;

/*
 * method b contains critical statements that 
 * can throw an exception what we can do is we can wrap that critical statment in try catch block in function b()
 * this is one way another way is we are not handling exception, in b we are telling the function which is calling b() that is a() that you have to handle exception coming from b(). so we will use b() throws Exception like this to tell a() that is calling b() to handle exception  
 * NOTE: YOU CAN WRITE throws Exception in front of main method but it should not be done because this tell JVM to handles Exception and JVM can't handle exception it's just an application.
 */
public class ExceptionThird {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Demo {
    public void a() throws Exception {
        try {
            b();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

    // public void b() {
    // int num1 = 8;
    // int num2 = 0;
    // try {
    // int result = num1 / num2;
    // System.out.println("result: " + result);
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println("Error: " + e.getMessage());
    // }
    // }
    public void b() throws Exception {
        int num1 = 8;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println("result: " + result);

        // TODO: handle exception
        System.out.println("Error: " + e.getMessage());

    }
}