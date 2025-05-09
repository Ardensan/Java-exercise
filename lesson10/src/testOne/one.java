package testOne;

import java.text.NumberFormat;
import java.util.Locale;

public class one {
    public static void main(String[] args) {
        int n=123400;
        System.out.println(n);
        System.out.println(Integer.toHexString(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));
    }
}
