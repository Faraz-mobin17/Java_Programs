package Foundation.Inheritance;


public class Inheritance3 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();    
    }
}

class Animal {
    // public void sleep() {
    //     System.out.println("Animal needs sleep");
    // }
     void sleep() {
        System.out.println("Animal needs sleep");
    }
    // void age() {
    //     System.out.println("age");
    // }
    void age(int x) {
        System.out.println(x);
    }
}

class Tiger extends Animal {
    // void sleep() { // cannot decrease visibility of overidding method use public access specifier
    //     System.out.println("Tiger needs sleep");
    // }
    public void sleep() { // increaseing visibiilty is permissible
        System.out.println("Tiger needs sleep");
    }
    // public int age() {return 10;} // return type should be same
    public void age() { // specialized method
        System.out.println("not a overriding method because args list is not same");
    }
}