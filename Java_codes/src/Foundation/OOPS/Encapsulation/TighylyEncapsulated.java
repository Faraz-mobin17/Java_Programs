package Foundation.OOPS.Encapsulation;

public class TighylyEncapsulated {
    public static void main(String[] args) {

    }
}

/*
 * A and C are tightly encapsulated class because
 */
class A {
    private int a = 10;
}

class B extends A {
    int b = 20;
}

class C extends A {
    private int c = 40;
}

// all three are not tightly encapsulated. if parent class is not tightly
// encapsulated
// then child class which inherit from parent are also not tightly encapsulated
class One {
    int x = 10;
}

class Two extends One {
    private int y = 10;
}

class Three extends Two {
    private int z = 30;
}