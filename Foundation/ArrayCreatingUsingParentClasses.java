package Foundation;

public class ArrayCreatingUsingParentClasses {
    public static void main(String[] args) {
        Object[] num = new Object[10];
        num[0] = new Object();
        num[1] = new String("faraz");
        num[2] = new Integer(1);

        Number[] num2 = new Number[10];
        num2[0] = new Integer(10);
        num2[1] = new Double(20);
        // num3[2] = new String("Error"); // not a child of number class

        Runnable[] r = new Runnable[10];
        r[0] = new Thread();
        // r[1] = new String("Invalid"); // strign doesn't implement runnable

    }
}
