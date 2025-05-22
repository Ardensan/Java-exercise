package testTwo;

import java.time.LocalDateTime;

public class three {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2022,11,4,20,10,15);
        System.out.println(dt);
        LocalDateTime dt2=dt.plusDays(4).minusHours(10);
        System.out.println(dt2);
        LocalDateTime dt3=dt2.withYear(2018).withSecond(50);
        System.out.println(dt3);
    }
}
