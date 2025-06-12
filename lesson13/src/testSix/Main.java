package testSix;

import javax.crypto.KeyAgreement;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.HexFormat;

class Person{
    public final String name;
    public PublicKey publicKey;
    public PrivateKey privateKey;
    public byte[] secretKey;
    public Person(String name){
        this.name=name;
    }
    public void generateKeyPair(){
        try{
            KeyPairGenerator kpGen=KeyPairGenerator.getInstance("DH");
            kpGen.initialize(512);
            KeyPair kp=kpGen.generateKeyPair();
            this.privateKey=kp.getPrivate();
            this.publicKey=kp.getPublic();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void generateSecretKey(byte[] receivedPubKeyBytes){
        try{
            X509EncodedKeySpec keySpec=new X509EncodedKeySpec(receivedPubKeyBytes);
            KeyFactory kf=KeyFactory.getInstance("DH");
            PublicKey receivedPublicKey=kf.generatePublic(keySpec);
            //生成本地密钥
            KeyAgreement keyAgreement=KeyAgreement.getInstance("DH");
            keyAgreement.init(this.privateKey);
            keyAgreement.doPhase(receivedPublicKey,true);
            this.secretKey=keyAgreement.generateSecret();
        }catch (GeneralSecurityException e){
            throw new RuntimeException(e);
        }
    }
    public void printKeys(){
        System.out.println("name:"+this.name);
        System.out.println("Private key:"+ HexFormat.of().formatHex(this.privateKey.getEncoded()));
        System.out.println("Public key:"+HexFormat.of().formatHex(this.publicKey.getEncoded()));
        System.out.println("Secret key"+HexFormat.of().formatHex(this.secretKey));
    }
}

public class Main {
    public static void main(String[] args) {
        Person bob=new Person("bob");
        Person alice=new Person("alice");
        bob.generateKeyPair();
        alice.generateKeyPair();
        bob.generateSecretKey(alice.publicKey.getEncoded());
        alice.generateSecretKey(bob.publicKey.getEncoded());
        bob.printKeys();
        alice.printKeys();
    }
}
