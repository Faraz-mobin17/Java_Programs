package MCQ;

public class AKC {
    private AKC(Object o) {
        System.out.println("Object");
    }
    private AKC(double[] d) {
        System.out.println("Double array");
    }
    public static void main(String[] arg) {
        new AKC(null);
        int main = 2;
        int args = 3;
        System.out.println(args);
        System.out.println(main);
    }
}
