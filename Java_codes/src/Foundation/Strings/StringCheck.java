package Foundation.Strings;
/*
 * Strings are immutable 
 * and strings buffer and builder and not as shown in the example below
 * == check reference equals method checks content
 */
public class StringCheck {
    public static void main(String[] args) {
        String brand = "pwskills";
        System.out.println(brand);
        brand = "hello";
        System.out.println(brand);
        brand.concat("World");
        System.out.println(brand);

        StringBuilder brand2 = new StringBuilder("Pwskills`");
        System.out.println(brand2);
        brand2.append("best");
        System.out.println(brand2);

        System.out.println("================");
        String s1 = "pwskills";
        String s2 = "pwskills";

        System.out.println(s1 == s2);
        /*
         * == compares string object references and equals method compares content of a string
         */
        String s3 = new String("pwskills");
        String s4 = new String("pwskills");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = new String("pw");
        String s6 = "pw";
        String s7 = "PW";
        System.out.println("Using equals method : " + s5.equals(s6));
        System.out.println("Ignoring lowercase: " + s6.equalsIgnoreCase(s7));

        String s8 = new String();
        System.out.println("String s8:  " + s8);

        String s9 = "pwjava";
        String s10 = "pwjava";
        String s11 = "pwJAVA";
        System.out.println("S9 and s10: " + (s9 == s10));
        System.out.println("S9 and s11: " + (s9 == s11));
    }
}
