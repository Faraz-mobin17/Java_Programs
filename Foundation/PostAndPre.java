package Foundation;
public class PostAndPre {
    public static void main(String[] args) {

        int a = 5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int b = a++;
        // int b = ++a;

        int c = a ++ + ++a + --a;
        System.out.println(c);
        
        int d = 5;
        // 5 + 7 + 8 + 8 + 8 + 8;
        int e = d++ + ++d + ++d + d++ + --d + d--;
        System.out.println(d);
        System.out.println(e);
    }
}
