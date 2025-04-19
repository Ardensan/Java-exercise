package TreeMapTest;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Person{
    String name;
    public Person(String name){this.name=name;}
    public String toString(){return "{Person: "+ name +"}";}
}
public class Main {
    public static void main(String[] args) {
        Map<Person,Integer> map =new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map.put(new Person("tom"),1);
        map.put(new Person("bob"),2);
        map.put(new Person("alex"),3);
        for(Person key:map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.get(new Person("bob")));
    }
}
