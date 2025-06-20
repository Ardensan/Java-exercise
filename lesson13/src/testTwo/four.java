package testTwo;

import java.security.MessageDigest;
import java.util.HexFormat;

public class four {
    public static void main(String[] args) {
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update("hello".getBytes("UTF-8"));
            md.update("world".getBytes("UTF-8"));
            byte[] result=md.digest();
            System.out.println(HexFormat.of().formatHex(result));
        }catch (Exception e){
        }
    }
}
