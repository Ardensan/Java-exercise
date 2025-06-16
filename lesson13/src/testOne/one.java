package testOne;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class one {
    public static void main(String[] args) {
        String en= URLEncoder.encode("中文!", StandardCharsets.UTF_8);
        System.out.println(en);
    }
}
