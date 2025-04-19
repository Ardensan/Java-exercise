package TreeMapTest;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Student{
    String name;
    int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;}
    public String toString(){return String.format("{%s: score=%d}",name,score);}
}
public class testOne {
    public static void main(String[] args) {
        Map<Student,Integer> map =new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score==o2.score){
                    return 0;
                }
                return o1.score>o2.score?1:-1;
            }
        });
        map.put(new Student("tom",77),1);
        map.put(new Student("bob",62),2);
        map.put(new Student("alex",91),3);
        for(Student key:map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.get(new Student("bob",62)));
    }
}
