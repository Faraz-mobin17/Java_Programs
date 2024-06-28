import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();
        System.out.println("Enter Email");
        String email = sc.nextLine();
        System.out.println("Enter fullname");
        String fullname = sc.nextLine();
        System.out.println("Enter avatar");
        String avatar = sc.nextLine();
        System.out.println("Enter cover Image");
        String coverImage = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        User newUser = new User(1, 1, username, email, fullname, avatar, coverImage, password);
        newUser.registerUser();
        newUser.loginUser(username, password);
        // newUser.deleteUser();
        System.out.println("Username: " + newUser.getUsername());
        System.out.println("Email: " + newUser.getEmail());
        System.out.println("FullName: " + newUser.getFullname());
    }
}
