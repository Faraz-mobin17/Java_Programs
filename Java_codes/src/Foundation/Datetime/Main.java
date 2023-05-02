package Foundation.Datetime;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        long timeInMS = dt.getTime();
        System.out.println(timeInMS);
        java.sql.Date dt2 = new java.sql.Date(timeInMS);
        System.out.println(dt2);
    }
}
