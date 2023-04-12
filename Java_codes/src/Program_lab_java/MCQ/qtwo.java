package MCQ;

public class qtwo {
    public static void main(String[] args) {
        int a = 2147483646;
        System.out.println(a); // 2147483646
        a++; // 2147483647
        System.out.println(a); // 2147483647
        a++; // -2147483648
        System.out.println(a); // -2147483648
        a++; // -2147483647
        System.out.println(a); // -2147483647
        a++; // -2147483646
        System.out.println(a); // -2147483646
        a++; // -2147483645
        System.out.println(a); // -2147483645
    }

}