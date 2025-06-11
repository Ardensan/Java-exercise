package testSeven;

import org.bouncycastle.util.encoders.Hex;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.HexFormat;

class Person{
    String name;
    PrivateKey sk;
    PublicKey pk;
    public Person(String name) throws GeneralSecurityException{
        this.name=name;
        KeyPairGenerator kpGen=KeyPairGenerator.getInstance("RSA");
        kpGen.initialize(1024);
        KeyPair kp=kpGen.generateKeyPair();
        this.sk=kp.getPrivate();
        this.pk=kp.getPublic();
    }
    public byte[] getPrivateKey(){
        return this.sk.getEncoded();
    }
    public byte[] getPublicKey(){
        return this.pk.getEncoded();
    }
    //用公钥加密
    public byte[] encrypt(byte[] message) throws GeneralSecurityException{
        Cipher cipher =Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,this.pk);
        return cipher.doFinal(message);
    }
    //用私钥解密
    public byte[] decrypt(byte[] input) throws  GeneralSecurityException{
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE,this.sk);
        return cipher.doFinal(input);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        //明文
        byte[] plain="hi,bill".getBytes("UTF-8");
        Person alex=new Person("alex");
        byte[] pk=alex.getPublicKey();
        System.out.println("pk: "+ HexFormat.of().formatHex(pk));
        byte[] enc=alex.encrypt(plain);
        System.out.println("加密的内容"+ HexFormat.of().formatHex(enc));
        //用alex的私钥解密
        byte[] sk=alex.getPrivateKey();
        System.out.println("sk: "+HexFormat.of().formatHex(sk));
        byte[] dec=alex.decrypt(enc);
        System.out.println(new String(dec,"UTF-8"));
    }
}
