package testOne;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class five {
    //Calendar设置特定的时间
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        //清除所有,再去设置时间
        c.clear();
        c.set(Calendar.YEAR,2022);
        c.set(Calendar.MONTH,12);
        c.set(Calendar.DATE,5);
        c.set(Calendar.HOUR_OF_DAY,21);
        c.set(Calendar.MINUTE,22);
        c.set(Calendar.SECOND,12);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
