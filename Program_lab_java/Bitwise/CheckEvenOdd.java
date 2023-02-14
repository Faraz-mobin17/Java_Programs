package Bitwise;
public class CheckEvenOdd {
    public static void main(String[] args) {
        int n=5;
        if((n&1)==1){
            System.out.println("odd");
        }        
        else{
            System.out.println("even");
        }
    }
}
