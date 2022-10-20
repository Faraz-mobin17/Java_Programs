package Method_Overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Example one = new Example();
        Example two = new Example();
        Example three = new Example();
        one.add(5, 3);
        two.add(5.3f, 6.2f);

    }

}

class Example {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    double add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}