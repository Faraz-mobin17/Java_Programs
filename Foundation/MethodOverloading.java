package Foundation;


public class MethodOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        byte b = 2;
        obj.show(2);
        obj.show(b); // object promotion to short
        obj.show('f'); // if char is not present the preference will go to int
    }
}


class Calc {
    // public void show(byte b) {
    //     System.out.println("Byte: " + b);
    // }
    public void show(short s) {
        System.out.println("Short: " + s);
    }
    public void show(int i) {
        System.out.println("Int: " + i);
    }
    public void show(double d) {
        System.out.println("Double: " + d);
    }
    // public void show(char c) {
    //     System.out.println("Char: " + c);
    // }
}
