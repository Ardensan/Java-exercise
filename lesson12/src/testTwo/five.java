package testTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class five {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        p.matcher("010-12345678").matches();
        System.out.println(p.matcher("021-123456").matches());
        System.out.println(p.matcher("022#1234567").matches());
        Matcher m=p.matcher("010-12345678");
        if(m.matches()){
            String g0=m.group(0);
            String g1=m.group(1);
            String g2=m.group(2);
            System.out.println(g0);
            System.out.println(g1);
            System.out.println(g2);
        }
    }
}
