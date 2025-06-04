package testTwo;

public class three {
    public static void main(String[] args) {
        String re="learn\\s([jJ]ava|[pP]hp|[gG]o)";
        System.out.println("learn Java".matches(re));
        System.out.println("learn go".matches(re));
        System.out.println("learn Php".matches(re));
        System.out.println("learn dd".matches(re));
    }
}
