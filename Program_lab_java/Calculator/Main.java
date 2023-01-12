package Calculator;
public class Main {
    public static void main(String[] args) {
        Mod first = new Mod();
        first.add();
        first.substract();
        first.multiply();
        first.divison();
        first.module();
    }
}
class Calculator {
    int x = 10;
    int y = 5;
    void add() {
        System.out.println(x + y);
    }
}
class Sub extends Calculator{
    void substract() {
        System.out.println(x - y);
    }
}
class Mul extends Sub {
    void multiply() {

        System.out.println(x * y);
    }
}
class Div extends Mul {
    void divison() {
        System.out.println(x / y);
    }
}
class Mod extends Div {
    void module() {
        System.out.println(x%y);
    }
}

