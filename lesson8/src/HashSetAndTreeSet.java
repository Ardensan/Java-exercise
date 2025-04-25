import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSetAndTreeSet {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("apple");set.add("banana");
        set.add("date");set.add("cheery");
        for(String s:set){
            System.out.println(s);
        }
        System.out.println("----------");
        Set<String> setOne=new TreeSet<>();
        setOne.add("date");setOne.add("cheery");
        setOne.add("banana");setOne.add("apple");
        for(String a:setOne){
            System.out.println(a);
        }
    }
}
