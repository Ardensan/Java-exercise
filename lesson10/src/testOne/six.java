package testOne;

import java.util.Arrays;
import java.util.TimeZone;

public class six {
    public static void main(String[] args) {
        //默认时区
        TimeZone tzDefault=TimeZone.getDefault();
        //设置时区
        TimeZone tzNY=TimeZone.getTimeZone("America/New_York");
        System.out.println(tzDefault.getID());
        System.out.println(tzNY.getID());
        System.out.println(Arrays.stream(TimeZone.getAvailableIDs()).toList());
    }
}
