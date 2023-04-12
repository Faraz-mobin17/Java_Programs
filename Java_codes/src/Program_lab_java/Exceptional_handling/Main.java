package Exceptional_handling;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // try {
        // System.out.println(100 / 0);
        // System.out.println("this code will not be executed");
        // } catch (Exception e) {
        // System.out.println(e);
        // System.out.println(e.getMessage());
        // }
        // System.out.println("hello java");
        // error in this try catch
        // try {
        // System.out.println(100 / 0);
        // } catch (Exception e) {
        // System.out.println(e);
        // } catch (Exception teena) {
        // System.out.println(teena);
        // }
        // try {
        // System.out.println(100 / 0);
        // } catch (ArithmeticException e) {
        // System.out.println(e);
        // } catch (Exception teena) {
        // System.out.println(teena);
        // }
        // try {
        // System.out.println(100 / 0);
        // } catch (ArithmeticException e) {
        // System.out.println(e);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println(e);
        // } catch (NullPointerException e) {
        // System.out.println(e);
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        try {
            System.out.println("hello");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("i will always execute");
            // for (int i = 0; i < 10; i++) {
            // System.out.println(i);
            // }
            for (int i = 10; i >= 0; i--) {
                System.out.println(9 / i);
            }
        }
        // for (int i = 10; i >= 0; i--) {
        // System.out.println(9 / i);
        // }
    }
}
