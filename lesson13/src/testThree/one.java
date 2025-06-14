package testThree;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.util.HexFormat;
//生成随机函数去加盐
public class one {
    public static void main(String[] args) throws Exception {
        KeyGenerator keygen= KeyGenerator.getInstance("HmacMD5");
        SecretKey key=keygen.generateKey();
        byte[] skey=key.getEncoded();
        System.out.println(HexFormat.of().formatHex(skey));
        Mac mac=Mac.getInstance("HmacMD5");
        mac.init(key);
        mac.update("Hi,bill".getBytes("UTF-8"));
        byte[] result=mac.doFinal();
        System.out.println(HexFormat.of().formatHex(result));
    }
}
