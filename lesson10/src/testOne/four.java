package testOne;

import java.util.Calendar;

public class four {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=1+c.get(Calendar.MONTH);//月份这里只有0~11，所以要+1
        int d=c.get(Calendar.DAY_OF_MONTH);
        int w=c.get(Calendar.DAY_OF_WEEK);
        int hh=c.get(Calendar.HOUR_OF_DAY);
        int mm=c.get(Calendar.MINUTE);
        int ss=c.get(Calendar.SECOND);
        System.out.println(y + "-" +m+"-"+d+"-"+w+"-"+hh +"-"+mm+"-"+ss);
    }
}
