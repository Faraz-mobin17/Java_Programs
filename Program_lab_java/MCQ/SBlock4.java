package MCQ;

// OUTPUT: 9900
public class SBlock4 {
    public static void main(String[] args) {
        System.out.println(MyTest.getSum());
    }
}

class MyTest {
    static {
        initialize();
    }
    private static int sum;

    public static int getSum() {
        initialize();
        return sum;
    }

    private static boolean initialize = false;

    private static void initialize() {
        if (!initialize) {
            for (int i = 0; i < 100; i += 1) {
                sum += i;
            }
            initialize = true;
        }
    }
}
