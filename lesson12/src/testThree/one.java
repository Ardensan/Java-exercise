package testThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//默认是贪婪算法
public class one {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(\\d+)(0*)");
        Matcher m=p.matcher("123000");
        if(m.matches()){
            System.out.println(m.group(1));
            System.out.println("第二组是"+m.group(2));
        }
    }
}
