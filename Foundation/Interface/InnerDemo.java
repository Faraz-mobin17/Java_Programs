package Foundation.Interface;
/*
 * inner class has 3 types 
 * 1. member
 * 2. static
 * 3. anonymous
 */
class A 
{
    public void show() 
    {
        System.out.println("inside show");
    }
    class B 
    {
        // inner member class
        public void display() 
        {
            System.out.println("in display");
        }
    }
    static class C 
    {
        // inner static class only works for inner class
        public void display2() {
            System.out.println("inside display C class");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 =  obj.new B(); // B is inside a and B obj will be created with the help of A obj
        A.C obj2 = new A.C();
        obj.show();
        // display(); // can't access 
        // obj.display(); // can't access
        obj1.display();
    }
}
