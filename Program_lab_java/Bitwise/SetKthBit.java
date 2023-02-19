package Bitwise;
import java.util.Scanner;
public class SetKthBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the kth bit you want to set: ");
        int bit = input.nextInt();
        int mask = 1<<(bit-1);
        int new_num = (number | mask);
        if((new_num & mask) != 0){
            System.out.println("set");
        }else{
            System.out.println("not set");
        }
    }
}
