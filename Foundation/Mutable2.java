package Foundation;
/*
 * By default StringBuffer capacity is 16 if there is more characters than 16
 * capacity = (new_capacity + 1)*2 i.e 16 + 1 * 2
 * OUTPUT 
 *  capacity: 16
 *  String: abcdefghijklmnop
 *  capacity: 16
 *  capacity: 34
 *  length: 17
 *  String sb: 21
 *  Char At: F
 *  fAraz
*/
public class Mutable2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println("capacity: " + str.capacity());
        str.append("abcdefghijklmnop");

        System.out.println("String: " + str);
        System.out.println("capacity: " + str.capacity());

        str.append("z");

        System.out.println("capacity: " + str.capacity());
        System.out.println("length: " + str.length());

        System.out.println();

        StringBuffer sb = new StringBuffer("Faraz");
        System.out.println("String sb: " + sb.capacity());
        System.out.println("Char At: " + sb.charAt(0));
        sb.setCharAt(1, 'A');
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder(100);
        System.out.println(sb2.capacity());
        sb2.append("java");
        System.out.println("String: "  + sb2);
        
        sb2.trimToSize();  // changing capacity 
        System.out.println("Capacity: " + sb2.capacity());
        System.out.println("Reverse String: " + sb2.reverse());
    }
}
