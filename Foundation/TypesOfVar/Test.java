package Foundation.TypesOfVar;

public class Test {
    int x = 10;
    public static void main(String[] args) {
        /*
         * Non static variable cannot be derefrenced from 
         * static context but if we create object of Test class 
         * and try to access x it will work fine.
         */
        System.out.println(x); // will throw ct (compile time) 
        Test t = new Test();
        System.out.println(t.x); // will work fine.
        Test2 t2 = new Test2();
        System.out.println(t2.b); // false (default value)
        System.out.println(t2.i); // 0  (default value)
        System.out.println(t2.d);// 0.0 (default value)
        System.out.println(t2.s); // null (default value)

        Test3 t3 = new Test3();
        System.out.println(t3.x);
        System.out.println(Test3.x);
        System.out.println(x); // this will work if main method is present in the test3 class
    }
    public void print() {
        System.out.println(x); // now we can access because this method is in instance area
    }
}

class Test2 {
    int i;
    double d;
    float f;
    boolean b;
    String s;
}

class Test3 {
    static int x= 10;

}