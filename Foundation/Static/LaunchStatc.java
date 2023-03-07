package Foundation.Static;
/*
 * execution of java program
 * static var (executed automatically)
 * static block (executed automatically)
 * (we will tell the execution call)
 * main method
 * non static var
 * non static instance block
 * non static methods
 */
/*
 * NOTE: non static -> we can't call inside static
 * and static memebers -> we can call inside non static 
 * because stataic members are initialized before object creation
 * example
 * class someclassname {
 *      int a;
 *      static void display() {sop(a)} // error
 *      // a will throw error because object is not created
 *      // see NOTES above
 * }
 */
class Demo {
    static void display() {
        System.out.println("display method inside demo classs");
    }
    void display2() {
        System.out.println("no static display method inside demo class");
    }
}

public class LaunchStatc {
    static int age;
    static {
        age = 10;
        System.out.println("Static block executed value of age is: " + age );
    }
    static void display() {
        System.out.println("static display method");
    }
    public static void main(String[] args) {
        display();
        System.out.println("main method executed");
        display(); // display function depends upon where it is being called
        Demo.display();
        Demo d = new Demo();
        d.display2(); // non static method is being called using object of a class
        d.display(); // static method can be called using object ref and class also
        // Demo.display2(); // error cannot be called because it is non static

       
    }
}
