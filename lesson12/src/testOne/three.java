package testOne;

public class three {
    public static void main(String[] args) {
        String re1="a.c";
        System.out.println("a^c".matches(re1));
        System.out.println("ac".matches(re1));
        String re2="a\\dc";
        System.out.println("a8c".matches(re2));
        System.out.println("adc".matches(re2));
        String re3="a\\wc";
        System.out.println("a%c".matches(re3));
        System.out.println("a_c".matches(re3));
    }
}
