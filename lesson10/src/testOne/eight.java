package testOne;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class eight {
    public static void main(String[] args) {
        //能对日期进行加减运算
        Calendar c=Calendar.getInstance();
        c.clear();
        c.set(2024,8,20,8,15,0);
        //+8天
        c.add(Calendar.DAY_OF_MONTH,8);
        //-3个月
        c.add(Calendar.MONTH,-3);
        var sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(c.getTime()));
    }
}
