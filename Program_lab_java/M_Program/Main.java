package M_Program;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        B obj = new B();
        obj.show(7.9);
    }
}

class A {
    double a = 9.5;
}

class B extends A {
    double a = 8.45;

    void show(double a) {
        System.out.println(a);
    }
}
