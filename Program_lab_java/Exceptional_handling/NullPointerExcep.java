package Exceptional_handling;

public class NullPointerExcep {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());    
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

    }
}
