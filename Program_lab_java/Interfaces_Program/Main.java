package Interfaces_Program;

public class Main {
    public static void main(String[] args) {
        C first = new C();
        first.display();
        first.show();
    }
}

abstract class D {
    abstract void abc();
}

interface A {
    void display();
}

interface B {
    void show();
}

class C implements A, B {
    public void display() {
        System.out.println("display method0");
    }

    public void show() {
        System.out.println("show method");
    }
}