package testTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class five {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime target=LocalDateTime.of(2022,11,29,8,11,12);
        System.out.println(now);
        //isBefore的方法是问这个时间比对比的时间要早吗？
        System.out.println(now.isBefore(target));
        //isAfter是问这个时间比对比的时间要晚吗？
        System.out.println(now.isAfter(target));
        System.out.println(LocalDate.now().isBefore(LocalDate.of(2024,11,15)));
        System.out.println(LocalTime.parse("13:50:42"));
        System.out.println(LocalTime.now().isAfter(LocalTime.parse("13:50:42")));
    }
}
