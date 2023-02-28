package Foundation;

public class MutableString {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("faraz");
        sb.append("Mobeen");
        System.out.println(sb);
        sb = new StringBuffer("MCA");
        System.out.println(sb);

        /*
         * final keywords doesn't change the nature of 
         * mutable string as shown below append method is working
         * but reassign and changing value not working sb2 is 
         * pointing to MCA and it will not accept new reference given to sb2
         */
        final StringBuffer sb2 = new StringBuffer(" MCA ");
        System.out.println(sb2);
        sb2.append("-Program-");
        sb2 = new StringBuffer(" SEM 2"); // compile time error because of final keyword
        System.out.println(sb2);

        StringBuilder strbldr = new StringBuilder("pw");
        strbldr.append("skills");
        
        System.out.println(strbldr);


    }
}
