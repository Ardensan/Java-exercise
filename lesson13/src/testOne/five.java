package testOne;

import java.util.Arrays;
import java.util.Base64;

public class five {
    public static void main(String[] args) {
        byte[] input=new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad, 0x21};
        String b64= Base64.getEncoder().encodeToString(input);
        String b642=Base64.getEncoder().withoutPadding().encodeToString(input);
        System.out.println(b64);
        System.out.println(b642);
        byte[] output=Base64.getDecoder().decode(b642);
        System.out.println(Arrays.toString(output));
    }
}
