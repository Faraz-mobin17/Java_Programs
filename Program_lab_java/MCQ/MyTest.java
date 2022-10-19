package MCQ;

// static variable belongs to class
public class MyTest {
    // static int i;
    static int i = 20;
    int j = 10;
    // static {
    // i = 10;
    // System.out.println("Static block called");
    // }
    // error non static variable cannot be accessed in static block
    // static {
    // j = 10;
    // System.out.println(j);
    // }
    static {
        i++;
    }
    static {
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(MyTest.i);
    }
}
