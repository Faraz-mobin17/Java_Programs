package Method_Overidding;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Child obj = new Child();
        Parent obj2 = new Parent();
        int ans = obj.method(5, 3);
        int ans2 = obj2.method(5, 3);
        System.out.println(ans);
        System.out.println(ans2);
    }
}

class Parent {

    int method(int a, int b) {
        return a + b;
    }
}

class Child extends Parent {

    int method(int a, int b) {
        return a * b;
    }
}