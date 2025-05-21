package testOne;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class seven {
    public static void main(String[] args) {
        //将北京时区转换为纽约时区
        Calendar c=Calendar.getInstance();
        c.clear();
        c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        c.set(2024,10,20,8,15,1);
        var sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(sdf.format(c.getTime()));
    }
}
