package testOne;

import java.util.Arrays;
import java.util.Base64;

public class six {
    public static void main(String[] args) {
        byte[] input = new byte[] { 0x01, 0x02, 0x7f, 0x00 };
        String b64en= Base64.getUrlEncoder().encodeToString(input);
        System.out.println(b64en);
        byte[] output=Base64.getUrlDecoder().decode(b64en);
        System.out.println(Arrays.toString(output));
    }
}
