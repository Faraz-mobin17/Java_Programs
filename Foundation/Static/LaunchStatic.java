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
 * OUTPUT
 * Control in static block
* Java initialization block
* Value of static variable: 10
* Value of static variable: 20
* Value of Instance Variable: 100
* Value of Instance Variable: 200
 */
class Demo1 
{
    static int a,b;
    int m,n;
    static 
    {
        a = 10;
        b = 20;
        System.out.println("Control in static block");
    }

    {
        System.out.println("Java initialization block");
        m = 100;
        n = 200;

    }

    static void display1() {
        System.out.println("Value of static variable: " + a);
        System.out.println("Value of static variable: " + b);
    }
    void display2() {
        System.out.println("Value of Instance Variable: " + m);
        System.out.println("Value of Instance Variable: " + n);
    }
}

public class LaunchStatic {
    public static void main(String[] args) {
        Demo1 dd = new Demo1();
        Demo1.display1();
        dd.display2();
    }
}
