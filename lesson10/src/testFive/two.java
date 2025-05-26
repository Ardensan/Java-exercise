package testFive;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class two {
    public static void main(String[] args) {
        Instant ins=Instant.ofEpochSecond(1448568760);
        System.out.println(ZoneId.systemDefault());
        ZonedDateTime zdt=ins.atZone(ZoneId.systemDefault());
        System.out.println(ins);
        System.out.println(zdt);
    }
}
