package MCQ;

public class PrivateMain {
     private static void main(String[] args) {
        System.out.println( "hello world ");
    }
    protected static void main(String[] args) {
        System.out.println( "hello world ");
    }
    default static void main(String[] args) {
        System.out.println( "hello world ");
    }
    public void main(String[] args) {
        System.out.println( "hello world ");
    }
}
