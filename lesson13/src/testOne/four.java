package testOne;

import java.util.Arrays;
import java.util.Base64;

public class four {
    public static void main(String[] args) {
        byte[] output= Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));
    }
}
