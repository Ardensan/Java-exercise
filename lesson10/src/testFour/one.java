package testFour;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class one {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("E,yyyy-MMMM-dd HH:mm", Locale.JAPAN);
        System.out.println(f.format(zdt));
        DateTimeFormatter ff=DateTimeFormatter.ofPattern("yyyy MMM dd EE HH:mm", Locale.CHINA);
        System.out.println(ff.format(zdt));
        var fff=DateTimeFormatter.ofPattern("yyyy-MM-dd 'T'HH:mm ZZZZ");
        System.out.println(fff.format(zdt));
    }
}
