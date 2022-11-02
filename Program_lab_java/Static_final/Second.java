package Static_final;

//  will give you compile time error
public class Second {
    static final String name;
    static final int age;

    public static void main(String[] args) {
        new Second();
        System.out.println(Second.name);
        System.out.println(Second.age);
    }
}
