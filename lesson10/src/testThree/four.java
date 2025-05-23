package testThree;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class four {
    static LocalDateTime calcBj(LocalDateTime bj,int h,int m){
        ZonedDateTime bjZdt=bj.atZone(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zbj=bjZdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        LocalDateTime bj1=zbj.plusHours(h).plusMinutes(m).toLocalDateTime();
        return bj1;
    }
    public static void main(String[] args) {
        int h=13;
        int m=20;
        LocalDateTime departureAtBeijing = LocalDateTime.of(2019, 5, 15, 13, 0, 0);
        System.out.println(calcBj(departureAtBeijing,h,m));
        System.out.println(departureAtBeijing);
    }
}
