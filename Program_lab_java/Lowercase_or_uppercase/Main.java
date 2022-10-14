package Lowercase_or_uppercase;

public class Main {

    public static void checkCase(char input) {
        if (input >= 'a' && input <= 'z') {
            System.out.println("Lowercase Character");
        } else if (input >= 'A' && input <= 'Z') {
            System.out.println("Uppercase Character");
        } else {
            System.out.println("Not a Character");
        }
    }

    public static void main(String[] args) {
        char input = '#';
        checkCase(input);
    }
}
