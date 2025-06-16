package testOne;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;


public class two {
    public static void main(String[] args) {
        String decoded= URLDecoder.decode("%E4%B8%AD%E6%96%87%21", StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
