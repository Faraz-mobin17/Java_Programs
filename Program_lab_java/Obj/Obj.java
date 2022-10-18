package Obj;

public class Obj {
    public static void main(String[] args) {
        // int a = 10;
        Parent myObj = new Parent();
        // int a = myObj.add2();
        // System.out.println(a);
        myObj.add3();
    }
}

class Parent {
    int a = 10;
    int b = 20;
    int sum = a + b;

    void display() {
        System.out.println(a);
    }

    int add() {
        return a + b;
    }

    int add2() {
        return sum;
    }

    void add3() {
        // return a + b;
        System.out.println(a + b);
    }
}