package testOne;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class three {
    public static void main(String[] args) {
        byte[] input=new byte[]{(byte) 0xe4,(byte) 0xb8,(byte) 0xad};
        String b64encoede= Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoede);
        String c=new String(input, StandardCharsets.UTF_8);
        System.out.println(c);
    }
}
