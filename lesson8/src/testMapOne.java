import java.util.HashMap;
import java.util.Map;
public class testMapOne {
    public static void main(String[] args) {
        String key1="a";
        Map<String,Integer> map=new HashMap<>();
        map.put(key1,123);
        String key2=new String("a");
        map.get(key2);
        System.out.println(key1==key2);
        System.out.println(key1.equals(key2));
    }
}
