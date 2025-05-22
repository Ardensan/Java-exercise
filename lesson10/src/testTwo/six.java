package testTwo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class six {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022,1,10,8,15,0);
        LocalDateTime end=LocalDateTime.of(2023,11,25,15,11,55);
        Duration d=Duration.between(start,end);
        System.out.println(d);
        Period p= LocalDate.of(2020,1,2).until(LocalDate.of(2020,12,25));
        System.out.println(p);
    }
}
