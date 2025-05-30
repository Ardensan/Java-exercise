package testOne;

public class six {
    public static void main(String[] args) {
        String re1="a\\d{2}";
        System.out.println("a222".matches(re1));
        System.out.println("a12".matches(re1));
        System.out.println("a6".matches(re1));
        String re2="a\\d{1,2}";
        System.out.println("a2".matches(re2));
        System.out.println("a12".matches(re2));
        System.out.println("a222".matches(re2));
    }
}
