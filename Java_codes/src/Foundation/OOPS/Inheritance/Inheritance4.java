package Foundation.OOPS.Inheritance;
// multiple inheritance
class Demo1 {
    void display() {
        System.out.println("display method written in demo1 class");
    }
}

class Demo2 extends Demo1 {
    
}

class Demo3 extends Demo2 {


}

public class Inheritance4 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.display();        
    }
}
