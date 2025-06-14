package testThree;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.HexFormat;
//记录随机函数然后去
public class two {
    public static void main(String[] args) throws Exception {
        byte[] hkey= HexFormat.of().parseHex(
                "b648ee779d658c420420d86291ec70f5" +
                "cf97521c740330972697a8fad0b55f5c" +
                "5a7924e4afa99d8c5883e07d7c3f9ed0" +
                "76aa544d25ed2f5ceea59dcc122babc8");
        SecretKey key=new SecretKeySpec(hkey,"HmacMD5");
        Mac mac=Mac.getInstance("HmacMD5");
        mac.init(key);
        mac.update("Hi,bill".getBytes("UTF-8"));
        byte[] result=mac.doFinal();
        System.out.println(HexFormat.of().formatHex(result));
    }
}
