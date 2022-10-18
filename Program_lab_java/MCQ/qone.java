package MCQ;

public class qone {
    public static void main(String[] args) {
        // -- is becoming + so -126 will become -127
        byte a = -126;
        System.out.println(a); // -126
        a--; // -127
        System.out.println(a); // -127
        a--; // -128
        System.out.println(a); // -128
        a--; // 127 bcz byte range is -128 to 127
        System.out.println(a); // 127 it will print
    }
}
