package testTwo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class six {
    public static void main(String[] args) {
        LocalTime d= LocalTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("HH:mm:ss");
        String s=d.format(f);
        System.out.println(s);
        Pattern p=Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
        System.out.println(p.matcher(s).matches());
        Matcher m=p.matcher(s);
        if(m.matches()){
            String g1=m.group(1);
            String g2=m.group(2);
            String g3=m.group(3);
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
        }
    }
}
