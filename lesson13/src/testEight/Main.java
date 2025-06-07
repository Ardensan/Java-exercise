package testEight;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.HexFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpGen=KeyPairGenerator.getInstance("RSA");
        kpGen.initialize(1024);
        KeyPair kp=kpGen.generateKeyPair();
        PrivateKey sk=kp.getPrivate();
        PublicKey pk=kp.getPublic();
        //待签名的消息
        byte[] message="hi,i'm ben".getBytes(StandardCharsets.UTF_8);
        //用私钥签名:
        Signature s=Signature.getInstance("SHA1withRSA");
        s.initSign(sk);
        s.update(message);
        byte[] signed=s.sign();
        System.out.println("签名是:"+ HexFormat.of().formatHex(signed));
        //用公钥去验证：
        Signature v=Signature.getInstance("SHA1withRSA");
        v.initVerify(pk);
        v.update(message);
        boolean valid=v.verify(signed);
        System.out.println("没被篡改吗?:"+valid);
        //用个其他的验证
        Signature d=Signature.getInstance("MD5withRSA");
        d.initVerify(pk);
        d.update(message);
        System.out.println("篡改了嘛？"+d.verify(signed));
    }
}
