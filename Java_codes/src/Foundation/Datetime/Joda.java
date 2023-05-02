package Foundation.Datetime;

import java.time.*;

public class Joda {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        System.out.println("Day: " + day + " Month: " + month + " Year: " + year);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int min = time.getMinute();
        int seconds = time.getSecond();
        int nanoSeconds = time.getNano();
        System.out.println("Hour: " + hour + " min: " + min + " seconds: " + seconds + " nanoSeconds: " + nanoSeconds);
    }
}
