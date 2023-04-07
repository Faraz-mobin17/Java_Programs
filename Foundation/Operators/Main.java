package Foundation.Operators;

/*
 * byte + byte = int
 * byte + short = int
 * short + short = int
 * byte + long = long
 * long + long = long 
 * long + double = double
 * float + double = double 
 * float + long = float
 * char + char = int 'a' + 'b' = 97 + 95 = 195
 * char + double = double 'a' + 0.89 = 97.89
 * NOTE: Airthmetic exception
 * it is a run time exception but not compile time error
 * it is possible only in integral airthmetic but not in floating point 
 * The only operator cause airthmetic exception are / and %
 */
public class Main {
    public static void main(String[] args) {
        int x = 10;
        // ++10; // will not work on decimal values
        // int y = ++x;
        // int z = ++(++x); // will not work because ++x will evaluate to decimal value
        // and on decimal value
        // we can't use increment and decrement operators

        final int a = 10;
        // a++; // will not work because of final keyword
        System.out.println(a);
        char ch = 'a';
        ch++;
        System.out.print(ch);
        boolean bool = true;
        // b++; // invalid doesn't work on boolean
        byte b = 10;
        b = b + 1; // b is of byte type and 1 is of int type so result will be in int so that is
                   // why it is giving ce possible loss of pricison found int required byte
        b = (byte) (b + 1); // this will solve the above problem
        System.out.println(b);
        byte bb = 10;
        b++; // in case of this internal type casting will be performed i.e: b = (type of b)
             // (b + 1 )
        System.out.println(bb);

        byte aa = 10;
        byte bbb = 20;
        byte c = aa + bbb; // error cannot convert int to byte a + b is int and it can't be assigned to
                           // byte it will give you compile time error possible loss of precision
                           // max(int,type of var1, type of var2)
        c = (byte) (aa + bbb); // this will work because of type casting
        /*
         * In Integral (byte,short,int,long) there is not way to represent infinity if
         * infinity is the result we will get airthmetic exception in integral
         * airthmetic
         * example sop(10 / 0) airthmetic exception but in floating point airthmetic
         * there is way to represent airthmetic
         */
        System.out.println(c);
        System.out.println(10 / 0); // int / int = airthmetic exception divide by 0
        System.out.println(10 / 0.0); // int / dobule = infinity
        System.out.println(-10.0 / 0); // double / int = -infinity
        System.out.println(0 / 0); // int / int
        System.out.println(0.0 / 0); // double / int
        System.out.println(0 / 0); // 0/0 is undefined this is of integral type so it will throw airthmetic
                                   // exception divide by 0
        System.out.println(0.0 / 0); // in floating point we have undefined so it will return NaN (not a number)
        System.out.println(-0 / 0.0); // NaN
        System.out.println(10 < Float.NaN); // false
        System.out.println(10 <= Float.NaN); // false
        System.out.println(10 > Float.NaN); // false
        System.out.println(10 >= Float.NaN); // false
        System.out.println(10 == Float.NaN); // fales
        System.out.println(10 != Float.NaN); // true
        System.out.println(Float.NaN == Float.NaN); // false
        System.out.println(Float.NaN != Float.NaN); // true
    }
}
