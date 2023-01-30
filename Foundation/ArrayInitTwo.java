package Foundation;

public class ArrayInitTwo {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        x[2.5] = 6;// compile time error possible loss of pricision double value found
        x[-5] = 7; // run time exception arrayindexoutofbound
        x[5] = 8; // run time exception array index out bound
    }
}
