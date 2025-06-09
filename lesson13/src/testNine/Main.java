package testNine;

import javax.crypto.Cipher;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.security.*;
import java.util.HexFormat;


public class Main {
    static KeyStore loadKeyStore(String keyStoreFile,String password){
        try(InputStream input =Main.class.getResourceAsStream(keyStoreFile)){
            if(input==null){
                throw new RuntimeException("没有文件"+keyStoreFile);
            }
            KeyStore ks=KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(input,password.toCharArray());
            return ks;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    static byte[] encrypt(X509Certificate certificate, byte[] message) throws GeneralSecurityException{
        Cipher cipher=Cipher.getInstance(certificate.getPublicKey().getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE,certificate.getPublicKey());
        return cipher.doFinal(message);
    }

    static byte[] decrypt(PrivateKey privateKey,byte[] data) throws GeneralSecurityException{
        Cipher cipher=Cipher.getInstance(privateKey.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        return cipher.doFinal(data);
    }

    static byte[] sign(PrivateKey privateKey,X509Certificate certificate,byte[] message) throws  Exception{
        Signature signature=Signature.getInstance(certificate.getSigAlgName());
        signature.initSign(privateKey);
        signature.update(message);
        return signature.sign();
    }

    static boolean verify(X509Certificate certificate,byte[] message,byte[] sig) throws Exception{
        Signature signature=Signature.getInstance(certificate.getSigAlgName());
        signature.initVerify(certificate);
        signature.update(message);
        return signature.verify(sig);
    }

    public static void main(String[] args) throws Exception {
        byte[] message="hello,bill".getBytes("UTF-8");
        //读取生成的证书的路径
        KeyStore ks=loadKeyStore(".\\my.keystore","123456");
        //读取私钥
        PrivateKey privateKey=(PrivateKey)ks.getKey("mycert", "123456".toCharArray());
        //读取证书
        X509Certificate certificate=(X509Certificate) ks.getCertificate("mycert");
        //加密
        byte[] encrypted=encrypt(certificate,message);
        System.out.println("加密后的："+ HexFormat.of().formatHex(encrypted));
        //解密
        byte[] decrypted=decrypt(privateKey,encrypted);
        System.out.println("解密后："+new String(decrypted,"UTF-8"));
        //签名
        byte[] sign=sign(privateKey,certificate,message);
        System.out.println("签名："+HexFormat.of().formatHex(sign));
        //验证签名
        boolean ver=verify(certificate,message,sign);
        System.out.println("是真的吗"+ver);
    }
}
