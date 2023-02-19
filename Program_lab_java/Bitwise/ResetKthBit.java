package Bitwise;
import java.util.Scanner;
public class ResetKthBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the kth bit you want to reset: ");
        int bit = input.nextInt();        
        int mask =(1<<(bit-1));
        mask = mask + 1;
        int new_number = number & mask;
        if (new_number != 0) {
            // code
            System.out.println("Bit is reset");
        } else {
            // code
            System.out.println("not reset");
        }
    }
}
