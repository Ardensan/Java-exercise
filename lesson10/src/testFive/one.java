package testFive;

import java.time.Instant;

public class one {
    public static void main(String[] args) {
        Instant now=Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());//秒
        System.out.println(now.toEpochMilli());//毫秒
    }
}
