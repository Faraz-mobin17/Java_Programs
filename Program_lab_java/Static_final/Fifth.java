package Static_final;

public class Fifth {
    public String name = "faraz";

    Fifth() {
        this(5);
        System.out.println("constructor with no args");
    }

    Fifth(int x, int y) {

        System.out.println(x + " " + y);
    }

    Fifth(int x) {
        this(5, 10);
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Fifth();

    }
}
