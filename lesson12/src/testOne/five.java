package testOne;

public class five {
    public static void main(String[] args) {
        String re1="a\\d*";
        System.out.println("a".matches(re1));
        System.out.println("a5".matches(re1));
        System.out.println("a312".matches(re1));
        String re2="a\\d+";
        System.out.println("a".matches(re2));
        System.out.println("a87".matches(re2));
        System.out.println("a3336".matches(re2));
        String re3="a\\d?";
        System.out.println("a".matches(re3));
        System.out.println("a7".matches(re3));
        System.out.println("a76".matches(re3));
    }
}
