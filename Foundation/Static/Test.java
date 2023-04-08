package Foundation.Static;

public class Test {
    int x = 10;
    static int y = 20;

    public void m1() {
        System.out.println(x); // can't access because object is not created
        System.out.println(y); // y is static and can be access from anywhere
    }

    public static void m2() {
        System.out.println(x); // can't access non static var from static context
        System.out.println(y);
    }

    public static void main(String[] args) {

    }
}