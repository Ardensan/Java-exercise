package EqualsFuntion;
import java.util.ArrayList;
import java.util.List;
public class ContainsTest {
    public static void main(String[] args) {
        List<String> a=new ArrayList<>(List.of("A","B","C"));
        System.out.println(a.contains("b"));
        System.out.println(a.contains("B"));
        System.out.println(a.indexOf("B"));
        System.out.println(a.indexOf(3));
        System.out.println(a.contains(new String("C")));
        System.out.println(a.indexOf("C"));
    }
}
