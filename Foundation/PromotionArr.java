package Foundation;

public class PromotionArr {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        char[] ch = {'a','b','c','d'};
        int[] b = x; // valid 
        int[] c = ch; // invalid char can be promoted to int but char arr can't be promted to int arr because char[] is an object of different class and int[] is an object of different class there is no relation with these two classes
    }
}
