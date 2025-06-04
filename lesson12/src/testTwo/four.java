package testTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class four {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m=p.matcher("010-12345678");
        if(m.matches()){
            String g1=m.group(1);
            String g2=m.group(2);
            String g3=m.group(0);
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
        }
    }
}
