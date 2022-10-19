package MCQ;

public class IBlock1 {
    public IBlock1() {
        System.out.println("no args constructor");
    }

    public IBlock1(int x) {
        System.out.println("Cons with args called: " + x);
    }

    public static void main(String[] args) {
        IBlock1 obj1, obj2;
        obj1 = new IBlock1();
        obj2 = new IBlock1(5);
    }
}
