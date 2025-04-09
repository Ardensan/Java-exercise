import java.util.ArrayList;
import java.util.List;
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");list.add("bob");
        list.add(null);list.add("apple");
        System.out.println(list.toString());
        List<Integer> a=List.of(1,2,3,4);
        for(int i=0;i<a.size();i++){
            int b=a.get(i);
            System.out.println(b);
        }
    }
}
