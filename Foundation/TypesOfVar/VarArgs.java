package Foundation.TypesOfVar;
/*
 * this feature came in java 1.5
 * ... are best friends you can't seprate them
 */
public class VarArgs {

    void sum(int... a) { // use of varArgs and internally it will be converted to 1d arr
        System.out.println("var args");
        int sum = 0;
        for (int x : a) { // for each loop came in 1.5 version
            sum += x;
        }
        System.out.println(sum);
    } 
    void anothersum(int...a) {
        int sum = 0;
        for (int x : a) sum += x;
        System.out.println(sum);
    }
    void sum2(int ...x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        System.out.println(sum);
    }
    void sum3(int x...) { // invalid
        int total = 0;
        for (int a : x) total += a;
        System.out.println(total);
    }
    void sum4(int. ..x) { // invalid
        int total = 0;
        for (int a : x ) total += a;
        System.out.println(total);
    }
    void sum4(int .x..) { // invalid
        int total = 0;
        for (int a : x) total += x;
        System.out.println(total);
    }
    void m1(int x, int...y) {
        System.out.println(x + " " + y);
    }
    void m2(String s,double...d) { // we can mix params
        System.out.println(s + " " + d);
    }
    void m3(double...d,String s) { // invalid last params should be var args params
        System.out.println(d + " " + s);
    }
    void m4(int...x,double...d) { // we can take only one var arg params
        System.out.println("invalid because more than one var arg params");
    }
    /*
    public static void m5(int...x) {

    }
    public static void m5(int[] x) {

    }
    cannot declare two method with same signature plus ... results in [] 
     */
    public static void m6(int...x) {
        System.out.println("var args method");
    }
    public static void m6(int x) {
        System.out.println("Genral method");
    }
    public static void m7(int[]... x) {
        // multidimensonal arr
        for (int[] a : x) {
            System.out.println(a[0]);
        }
    }
    public static void m8(int[][]... x) {
        // 3d arr 
    }
    public static void main(String... args) { // perfectly valid from 1.5 version
        VarArgs v = new VarArgs();
        // v.sum(10);
        // v.sum(10,20);
        // v.sum(10,20,30);
        // v.sum();
        // m6(); // var args method 
        // m6(10,20); // var args 
        // m6(10); // which method will be called. Ans -> genral method has high priority because of backward compatibility
        int[] a = {10,20,30};
        int[] b = {40,50};
        m7(a,b);
    }
}
