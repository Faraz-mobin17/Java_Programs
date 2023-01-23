package System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
        int num = System.in.read(); // gives you ASCII value
        System.out.println(num);
        System.out.println(num - 48);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in); // can take input from file , network and keyboard
        int num2 = Integer.parseInt(bf.readLine());
        System.out.println(num2);
        bf.close();

        // a better way
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
    }
}
