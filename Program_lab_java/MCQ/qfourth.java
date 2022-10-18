package MCQ;

// OUTPUT:
// Hello World
// No-args constructor invoked
// Hello World
// Parameterized constructor invoked
public class qfourth {
    public static void main(String[] args) {
        System.out.println();
        IBlock1 obj1, obj2;
        obj1 = new IBlock1();
        obj2 = new IBlock1(5);
    }
}

class IBlock1 {
    public IBlock1() {
        System.out.println("No-args constructor invoked");
    }

    public IBlock1(int x) {
        System.out.println("Parameterized constructor invoked");
    }

    {
        System.out.println("Hello World");
    }
}