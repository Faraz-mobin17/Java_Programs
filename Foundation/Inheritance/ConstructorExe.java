package Foundation.Inheritance;

public class ConstructorExe 
{
    public static void main(String[] args) {
        // Child c = new Child();
        // Child c = new Child(10,20);
        Child c = new Child();
    }
}

class Parent {
    int a,b;
    Parent() {
        System.out.println("parent class constructor");
    }
    Parent(int a, int b) {
        System.out.println("parent class parameterized constructor");
        this.a = a;
        this.b = b;
    }
}

class Child extends Parent {
    int m,n;
    Child() {
        // super(); // by default calling parent class default constructor
        // super(10,20); // calling parameterized constructor of parent class

        // this keyword will call the current class constructor
        this(10,20); // if this keyword is present then super() will not be called only one method can be called either super() or this()
        System.out.println("child class constrcutor");
    }
    Child(int m, int n) {
        // super() // by default calling parent class default constructor
        System.out.println("child class parameterized constructor");
        this.m = m;
        this.n = n;
    }
}