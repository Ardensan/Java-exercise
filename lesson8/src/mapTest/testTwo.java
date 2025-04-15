package mapTest;
import java.util.HashMap;
import java.util.Map;
public class testTwo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("orange",2);
        map.put("banana",3);
        for(String key:map.keySet()){
            Integer value=map.get(key);
            System.out.println(key + "=" + value);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key =entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + "="+ value);
        }
    }
}
