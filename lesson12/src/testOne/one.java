package testOne;

public class one {
    public static void main(String[] args) {
        String regex="20\\d\\d";
        System.out.println("2019".matches(regex));
        System.out.println("2105".matches(regex));
    }
}
