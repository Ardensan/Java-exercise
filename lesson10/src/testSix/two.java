package testSix;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
public class two {
    static String timestampToString(long epochMilli, Locale lo,String zoneID){
        Instant ins=Instant.ofEpochMilli(epochMilli);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.SHORT);
        var ff=f.withLocale(lo).format(ZonedDateTime.ofInstant(ins, ZoneId.of(zoneID)));
        return ff;
    }
    public static void main(String[] args) {
        long ts=1674208900000L;
        System.out.println(timestampToString(ts, Locale.CHINA, "Asia/Shanghai"));
        System.out.println(timestampToString(ts, Locale.US, "America/New_York"));
    }
}
