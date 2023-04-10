package Foundation.Static;

// compile with javac Parent.java and javacChild.java then run both the file
// ouput will be parent main method because that method will be inherited
// inheritance concepts applicable for static methods and main methods
/*
 * Inheritance and method overloaing applicable for static method but instead of
 * overidding method hiding is applicable
 */
public class Parent {

    public static void main(final String[] args) {
        System.out.println("parent main method");
    }
}

// class Child extends Parent { // ouput parent main method
// }
// this concepts in know as method hiding not overriding here
class Child extends Parent {
    public static void main(final String[] args) {

        System.out.println("child main emthod");
    }
}