package Foundation.Enums;

enum Week {
    MON, TUE, WED, THRU, FRI, SAT, SUN;
}

public class Main {
    enum Result {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);

        Result r = Result.PASS;
        System.out.println(r);

        Week[] wr = Week.values();

        for (Week w1 : wr) {
            System.out.println(w1 + " : " + w1.ordinal());
        }
    }
}
