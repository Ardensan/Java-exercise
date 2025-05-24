package testFour;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class two {
    public static void main(String[] args) {
        var ldt= LocalDateTime.now();
        System.out.println(DateTimeFormatter.ISO_DATE.format(ldt));
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(ldt));
    }
}
