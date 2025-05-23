package testThree;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class three {
    public static void main(String[] args) {
        ZonedDateTime zbj=ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zny=zbj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);
    }
}
