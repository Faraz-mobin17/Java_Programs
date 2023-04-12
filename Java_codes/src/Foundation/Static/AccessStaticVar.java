package Foundation.Static;
/*
 * static varibles are also known as class level
 * var or fields
 */
public class AccessStaticVar {
    static int x = 10;
    static double d;
    static String s;
    public static void main(String[] args) {
        AccessStaticVar t = new AccessStaticVar();
        /*
         * all will work fine
         */
        System.out.println(t.x);
        System.out.println(AccessStaticVar.x);
        System.out.println(x);

        System.out.println(d); // 0.0 (default values)
        System.out.println(s); // null (default values)

        Test t1 = new Test();
        t1.x = 888;
        t1.y = 999;

        Test t2  = new Test();
        System.out.println(t2.x + " " + t2.y); // O/P: 888 999

    }
    public void print() {
        /*
         * we can access static varible from 
         * both instance and static areas
         * because it is created at the time of 
         * class loading
         */
        System.out.println(x);
    }
}

class Test {
    static int x = 10;
    int y = 20;
}