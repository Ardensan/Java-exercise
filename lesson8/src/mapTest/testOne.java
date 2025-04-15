package mapTest;
import java.util.HashMap;
import java.util.Map;
public class testOne {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("orange",2);
        System.out.println(map.get("apple"));
        map.put("apple",2);
        System.out.println(map.get("apple"));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
