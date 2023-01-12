package Exceptional_handling;

public class NumberFormatExcep {
    
    public static void main(String[] args) {
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
