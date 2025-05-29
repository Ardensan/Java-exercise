package testOne;

public class four {
    public static void main(String[] args) {
        String re1="a\\sc";
        System.out.println("a c".matches(re1));
        System.out.println("a   c".matches(re1));
        System.out.println("adc".matches(re1));
        String re2="a\\Dc";
        System.out.println("abc".matches(re2));
        System.out.println("a3c".matches(re2));
    }
}
