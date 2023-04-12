package Foundation.Strings;

public class InbuiltStringMethods 
{
    public static void main(String[] args) 
    {
        String str = "PW Skills Java";
        System.out.println("String: " + str);
        System.out.println("To Uppercase: " + str.toUpperCase());        
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Character At: " + str.charAt(0));
        System.out.println("String Length: " + str.length());
        System.out.println("Substring: " + str.substring(1));
        System.out.println("Substring2: " + str.substring(1,4)); // beginIndex is inclusive and is exclusive
        System.out.println("Index of: " + str.indexOf('a'));
        System.out.println("Last Index of: " + str.lastIndexOf('a'));
    }
}
