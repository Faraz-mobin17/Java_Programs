package Foundation.Interface;
/* Java 8 features
 * default methods in interfaces
 * static methods in interface
 * funcitonal interface 
 */
interface A 
{
    void show();
    default void config() {
        System.out.println("in config");
    }
    static void abc() {
        System.out.println("in static method abc");
    }
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }
    // config method can be overidden here
}

public class JavaFe {
    public static void main(String[] args) {
        A.abc();
        // A.config(); // non static method
        A obj = new B();
        obj.show();
        obj.config();
    }
}
