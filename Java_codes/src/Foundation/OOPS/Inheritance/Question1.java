package Foundation.OOPS.Inheritance;

public class Question1 {
    public static void main(String[] args) {
        P p = new P();
        p.m1();
        /*
         * p.m2()
         * C.E: cannot find symbol
         * symbol: method m2()
         * location: class P
         */
        // p.m2(); // error parent class ref can't call child class method

        C c = new C();
        c.m1(); // but child can call parent class method
        c.m2();
        // below code will be explained in polymorphism
        P p1 = new C();
        p1.m1(); //
        // p1.m2(); // parent ref can hold child obj but can't call child method

        // C c1 = new P(); //parent ref can hold child obj but vice versa is not true
        /*
         * incompatible types found: p required: c for above p p1 = new C(); code
         */
    }
}

class P {
    void m1() {
        System.out.println("m1");
    }
}

class C extends P {
    void m2() {
        System.out.println("m2");
    }
}