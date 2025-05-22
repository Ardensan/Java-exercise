package testTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class two {
    public static void main(String[] args) {
        LocalDate d2=LocalDate.of(2021,11,25);
        LocalTime t2=LocalTime.of(15,16,18);
        LocalDateTime dt2=LocalDateTime.of(2022,10,5,12,24,37);
        System.out.println(d2);
        System.out.println(t2);
        System.out.println(dt2);
        LocalDate d=LocalDate.parse("2024-11-15");
        LocalTime t=LocalTime.parse("11:42:15");
        LocalDateTime dt=LocalDateTime.parse("2020-10-05T17:34:36");
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }
}
