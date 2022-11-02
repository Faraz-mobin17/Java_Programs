package Method_Overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Example one = new Example();
        Example two = new Example();
        // Example three = new Example();
        one.add(5, 3);
        two.add(5.3, 6.2, 5.8);
    }

}

class Example {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // double add(double a, double b, double c) { // error in method overloading
    // return type
    // // cannot change
    // // return a + b + c;
    // System.out.println(a + b + c);
    // }

    double add(double a, double b, double c) { // error in method overloading return type
        // cannot change
        return a + b + c;
        // System.out.println(a + b + c);
    }

}