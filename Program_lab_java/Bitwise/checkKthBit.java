package Bitwise;
import java.util.Scanner;

public class checkKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the Kth bit");
        int k = sc.nextInt();

         int mask = 1<<(k-1);
        if((n&mask) != 0){
            System.out.println("set");

        }else{
            System.out.println("not set");
        }
       
     }
}