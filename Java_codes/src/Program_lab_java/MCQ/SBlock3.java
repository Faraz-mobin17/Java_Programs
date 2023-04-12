package MCQ;

// 1st static init
// 2nd static init
// 1st instance init
// 2nd instance init
// No arg Constructor
// 1st instance init
// 2nd instance init
// one arg consturctor
public class SBlock3 {

    SBlock3(int x) {
        System.out.println("one arg consturctor");
    }

    SBlock3() {
        System.out.println("No arg Constructor");
    }

    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new SBlock3();
        new SBlock3(8);
    }
}
