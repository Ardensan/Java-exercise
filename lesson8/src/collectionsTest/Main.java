package collectionsTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(99);
        list.add(44);
        list.add(55);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
