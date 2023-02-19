package Foundation;

public class StringConcat 
{
    public static void main(String[] args) 
    {
        String s1 = new String("pw");
        s1 = s1.concat("skills");
        /*
         * In the above code string s1 is immutable but we are changing the reference of 
         * s1 to new string pwskills for more info check pwnotes
         */
        String s2 = new String("hello");
        s2.concat("skiils");
        /*
         * in the above code we aren't changing the reference of s2 that's why output is hello only
         */
        System.out.println("S1: " + s1);

        String s3 = "pwjava";
        String s4 = s3.concat("skills");
        String s5 = new String("pwjava");
         s5 = s5.concat("skills");
        System.out.println("S3: "+ s3);
        System.out.println("S4: " + s4);
        System.out.println("S5: " + s5);
        String s6 = "pw"; // scp (string constant pool)
        String s7 = "pw" + "java"; // scp (string constant pool)
        String s8 = "skills"; // scp  (string constant pool)
        String s9 = s7 + s8; // heap area
        System.out.println("S6: " + s6);
        System.out.println("S7: " + s7);
        System.out.println("S8: " + s8);
        System.out.println("S9: " + s9);
        String str = "pw" + 100 + 99;
        System.out.println("str: " + str);
        // str.concat(99); not allowed
    }
}
