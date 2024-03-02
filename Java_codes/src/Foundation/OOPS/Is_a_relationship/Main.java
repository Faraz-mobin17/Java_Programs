package Foundation.OOPS.Is_a_relationship;

public class Main {
    public static void main(String[] args) {

    }
}

class A {
    protected void m1() {
        System.out.println("m1");
    }
}

class B extends A { // it has two method another one come from parent because of inheritance
    protected void m2() {
        System.out.println("m2");
    }
}