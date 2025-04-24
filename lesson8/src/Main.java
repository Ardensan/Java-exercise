import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        System.out.println(set.add("a"));
        System.out.println(set.add("b"));
        System.out.println(set.add("a"));
        System.out.println(set.contains("a"));
        System.out.println(set.contains("A"));
        System.out.println(set.remove("de"));
        System.out.println(set.size());
    }
}