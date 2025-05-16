package testOne;

import java.util.Date;

public class two {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getYear()+1900+"年份");
        System.out.println(date.getMonth()+1 + "月份");
        System.out.println(date.getDate() + "号");
        System.out.println(date);
        System.out.println(date.toGMTString()+"英国时间");
        System.out.println(date.toLocaleString() +"本地时间");
    }
}
