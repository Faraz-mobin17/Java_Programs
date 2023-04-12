
package M_second_program;

class A {
    int a = 9;

    // this will work
    public static void main(String[] args) {
        System.out.println("hi");
        B obj = new B();
        obj.show(7);
    }
}

public class B extends A {
    int a = 8;

    void show(int a) {
        System.out.println(a);
    }
    // this will not work
    // public static void main(String[] args) {
    // System.out.println("hi");
    // B obj = new B();
    // obj.show(7.9);
    // }
}
