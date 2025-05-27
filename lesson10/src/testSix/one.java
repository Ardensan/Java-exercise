package testSix;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class one {
    public static void main(String[] args) {
        //将Date转换为Instant类型
        Instant ins1=new Date().toInstant();
        System.out.println(ins1);
        //获取当前时间戳
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        //将时间戳转换为时间
        Instant ins2=c.toInstant();
        System.out.println(ins2);
        //获取时区
        ZonedDateTime zdt=ins2.atZone(c.getTimeZone().toZoneId());
        System.out.println(zdt);
        System.out.println(c.getTimeZone().toZoneId());
    }
}
