package testTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class one {
    public static void main(String[] args) {
        int sum=0;
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();
        for(int i=0;i<99;i++){
            sum+=i;
        }
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(sum);
        System.out.println(dt);
        LocalDateTime dtOne=LocalDateTime.now();
        LocalDate dOne=dtOne.toLocalDate();
        LocalTime tOne=dtOne.toLocalTime();
        System.out.println(dtOne);
        System.out.println(dOne);
        System.out.println(tOne);
    }
}
