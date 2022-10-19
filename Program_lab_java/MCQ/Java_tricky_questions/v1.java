package MCQ.Java_tricky_questions;

// NOTE: STATIC BLOCK WILL BE EXECUTED FIRST ALWAYS
// OUTPUT: 
// static block
// i am in main // order doesn't matter
public class v1 {
    // static {
    // System.out.println("static block");
    // // System.exit(0); // shutdown the JVM
    // }
    // static {
    // System.out.println("1st static block");
    // }

    public static void main(String[] args) {
      for(i=10;i<10;i++)
      {
        static
        {
            System.out.println("i am in static");
        }
    }
        System.out.println("i am in main");
    }

    // static {
    // System.out.println("static block");
    // // System.exit(0); // shutdown the JVM
    // }
    // static {
    // System.out.println("2nd static block");
    // }
    // static {
    // System.out.println("2nd static block");
    // System.exit(0);
    // }

    static {
        System.exit(0);
        System.out.println("2nd static block");
    }
}