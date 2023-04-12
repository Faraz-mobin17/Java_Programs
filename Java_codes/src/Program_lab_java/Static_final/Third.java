package Static_final;

// cannot assign value to final var name and age
public class Third {
    static final String name;
    static final int age;

    Third() {
        name = "faraz";
        age = 22;
    }

    public static void main(String[] args) {
        new Third();
        System.out.println(Third.name);
        System.out.println(Third.age);
    }
}
