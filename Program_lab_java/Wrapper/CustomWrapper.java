package Wrapper;
public class CustomWrapper {
    public static void main(String[] args) {
        WrapperJava j = new WrapperJava(10);
        System.out.println(j);
        System.out.println(j.toString());
    }
}

class WrapperJava {
    private int i;
    WrapperJava() {}
    WrapperJava(int i) {
        this.i = i;
    }
    public int getValue() {
        return i;
    }
    public void setValue(int i) {
        this.i = i;
    }
    public String toString() {
        return Integer.toString(i);
    }
}
