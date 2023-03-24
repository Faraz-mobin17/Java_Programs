package Foundation.Interface;

interface A {
    int num = 0; // by default var in interface are public static final
    void show(); // by default public abstract
}
interface X {
    void abc();
}
public class Demo implements A,X {
    public static void main(String[] args) {
        System.out.println(A.num); // accessing becaues it is static
        A.num = 3; // cannot change because it is final
      
    }

    @Override
    public void abc() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abc'");
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}
