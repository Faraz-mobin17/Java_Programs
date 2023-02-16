package Bitwise;
public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int n=0;
        for (int i = 0; i < arr.length; i +=1 ) {
             n = arr[i] ^ n;
        }
        System.out.println(n);
    }
}
