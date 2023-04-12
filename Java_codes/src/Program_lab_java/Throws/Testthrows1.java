package Throws;

import java.io.IOException;

public class Testthrows1 {
     void method1() throws IOException {
        throw new IOException("Io exception throwed device err"); // checked exception
    }
    void method2() throws IOException {
        method1();
    }
     void method3() {
        try {
            method2();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Testthrows1 t1 = new Testthrows1();
        t1.method3();
        System.out.println("normal flow");
    }
}
