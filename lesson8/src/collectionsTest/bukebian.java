package collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class bukebian {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("bill");
        list.add("coach");
        List<String> immutable= Collections.unmodifiableList(list);
        list.add("dest");
        System.out.println(immutable);
        list.remove(2);
        System.out.println(immutable);
        list=null;
        System.out.println(list);
        System.out.println(immutable);
    }
}
