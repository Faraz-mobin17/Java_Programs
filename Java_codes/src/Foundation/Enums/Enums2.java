package Foundation.Enums;

enum Result {
    PASS, FAIL, NR; // 3 const so constructor will be called 3 times
    // behind the scene
    // public static final PASS = new Result();
    // public static final FAIL = new Result();
    // public static final NR = new Result();

    int marks;

    Result() {
        System.out.println("Constructor in enum");
    }

    void setMarks(int m) {
        marks = m;
    }

    int getMarks() {
        return marks;
    }
}

public class Enums2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int marks = Result.PASS.getMarks();
        System.out.println(marks);

        Result.FAIL.setMarks(15);
        int marks2 = Result.FAIL.getMarks();
        System.out.println(marks2);
    }
}
