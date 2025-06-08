package testFive;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Base64;
import java.util.HexFormat;

public class one {
    //加密
    static byte[] encrypt(String password,byte[] salt,byte[] input) throws GeneralSecurityException{
        PBEKeySpec keySpec=new PBEKeySpec(password.toCharArray());
        SecretKeyFactory skeyFactory=SecretKeyFactory.getInstance("PBEwithSHA1and128bitAES-CBC-BC");
        SecretKey skey=skeyFactory.generateSecret(keySpec);
        PBEParameterSpec pbeps=new PBEParameterSpec(salt,1000);
        Cipher cipher=Cipher.getInstance("PBEwithSHA1and128bitAES-CBC-BC");
        cipher.init(Cipher.ENCRYPT_MODE,skey,pbeps);
        return cipher.doFinal(input);
    }
    //解密
    static byte[] decrypt(String password, byte[] salt,byte[] input) throws GeneralSecurityException {
        PBEKeySpec keySpec=new PBEKeySpec(password.toCharArray());
        SecretKeyFactory skeyFactory=SecretKeyFactory.getInstance("PBEwithSHA1and128bitAES-CBC-BC");
        SecretKey skey=skeyFactory.generateSecret(keySpec);
        PBEParameterSpec pbeps=new PBEParameterSpec(salt,1000);
        Cipher cipher=Cipher.getInstance("PBEwithSHA1and128bitAES-CBC-BC");
        cipher.init(Cipher.DECRYPT_MODE,skey,pbeps);
        return cipher.doFinal(input);
    }

    public static void main(String[] args) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        String message="hi,bill";
        String password="123456";
        byte[] salt= SecureRandom.getInstanceStrong().generateSeed(16);
        System.out.println(HexFormat.of().formatHex(salt));
        byte[] data=message.getBytes("UTF-8");
        byte[] encrypted=encrypt(password,salt,data);
        System.out.println("加密后"+ Base64.getEncoder().encodeToString(encrypted));
        byte[] decrypted=decrypt(password,salt,encrypted);
        System.out.println("解密后"+new String(decrypted,"UTF-8"));
    }
}
