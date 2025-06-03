package testTwo;

public class two {
    public static void main(String[] args) {
        String re="learn\\s(java|php)";
        System.out.println("learn java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn Java".matches(re));
        System.out.println("learn  Go".matches(re));
    }
}
