package testThree;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class two {
    public static void main(String[] args) {
        //设定的LocalDateTime可以通过ZoneId去改变成ZonedDateTime对象
        LocalDateTime ldt=LocalDateTime.of(2024,12,11,15,24,33);
        ZonedDateTime zbj=ldt.atZone(ZoneId.systemDefault());
        System.out.println(zbj);
        ZonedDateTime zny=ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println(zny);
    }
}
