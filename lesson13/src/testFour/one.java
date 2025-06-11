package testFour;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.util.Base64;

public class one {
    static byte[] encrypt(byte[] key,byte[] input) throws GeneralSecurityException{
        Cipher cipher=Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keysPec=new SecretKeySpec(key,"AES");
        cipher.init(Cipher.ENCRYPT_MODE,keysPec);
        return cipher.doFinal(input);
    }
    static byte[] decrypt(byte[] key,byte[] input) throws GeneralSecurityException{
        Cipher cipher=Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpec=new SecretKeySpec(key,"AES");
        cipher.init(Cipher.DECRYPT_MODE,keySpec);
        return cipher.doFinal(input);
    }
    public static void main(String[] args) throws Exception {
        String message="hello,world";
        //128位的密钥=16bytes key: 1byte =8位
        byte[] key="1234567890abcdef".getBytes("UTF-8");
        System.out.println(key[2]);
        //加密
        byte[] data=message.getBytes("UTF-8");
        byte[] encrypted=encrypt(key,data);
        System.out.println("加密后"+ Base64.getEncoder().encodeToString(encrypted));
        byte[] decrypted=decrypt(key,encrypted);
        System.out.println("解密后"+new String(decrypted,"UTF-8"));
    }
}
