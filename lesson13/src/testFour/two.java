package testFour;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Base64;

public class two {
    static byte[] join(byte[] bs1,byte[] bs2){
        byte[] r=new byte[bs1.length+bs2.length];
        System.arraycopy(bs1,0,r,0,bs1.length);
        System.arraycopy(bs2,0,r,bs1.length,bs2.length);
        return r;
    }
    static byte[] encrypt(byte[] key,byte[] input) throws GeneralSecurityException{
        Cipher ciper=Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec=new SecretKeySpec(key,"AES");
        //CBC模式需要生成一个16位的随机数
        SecureRandom sr=SecureRandom.getInstanceStrong();
        byte[] iv=sr.generateSeed(16);
        IvParameterSpec ivps=new IvParameterSpec(iv);
        ciper.init(Cipher.ENCRYPT_MODE,keySpec,ivps);
        byte[] data=ciper.doFinal(input);
        return join(iv,data);
    }
    static byte[] decrypt(byte[] key,byte[] input) throws GeneralSecurityException{
        //把input分割成iv和密文
        byte[] iv=new byte[16];
        byte[] data=new byte[input.length-16];
        System.arraycopy(input,0,iv,0,16);
        System.arraycopy(input,16,data,0,data.length);
        //解密
        Cipher cipher=Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec=new SecretKeySpec(key,"AES");
        IvParameterSpec ivps=new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE,keySpec,ivps);
        return cipher.doFinal(data);
    }
    public static void main(String[] args) throws Exception {
        String message="hello,world";
        byte[] key="1234567890abcdef1234567890abcdef".getBytes("UTF-8");
        byte[] data=message.getBytes("UTF-8");
        byte[] encrypted=encrypt(key,data);
        System.out.println("加密"+ Base64.getEncoder().encodeToString(encrypted));
        byte[] decrypted=decrypt(key,encrypted);
        System.out.println("解密"+new String(decrypted,"UTF-8"));
    }
}
