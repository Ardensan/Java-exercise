package testTwo;

import java.security.MessageDigest;
import java.util.HexFormat;

public class five {
    public static void main(String[] args) throws Exception {
        MessageDigest md=MessageDigest.getInstance("SHA256");
        md.update("hi".getBytes("UTF-8"));
        md.update("bill".getBytes("UTF-8"));
        byte[] result=md.digest();
        System.out.println(HexFormat.of().formatHex(result));
    }
}
