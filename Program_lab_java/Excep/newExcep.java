package Excep;

public class newExcep {
    public static void main(String[] args) {
        System.out.println();
        newExcep obj = new newExcep();
        // try {
        // obj.method();
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println(e);
        // }
        obj.method();
    }

    void method() {
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        // System.out.println(100 / 0);
    }
}
