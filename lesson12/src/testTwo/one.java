package testTwo;

public class one {
    public static void main(String[] args) {
        String re="java|php";
        System.out.println("java".matches(re));
        System.out.println("php".matches(re));
        System.out.println("go".matches(re));
    }
}
