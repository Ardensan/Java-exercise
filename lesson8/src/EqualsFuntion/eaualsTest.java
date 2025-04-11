package EqualsFuntion;
import java.util.List;
import java.util.Objects;
class person{
    String name;
    public person(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof person person)) return false;
        return Objects.equals(name, person.name);
    }
}
public class eaualsTest {
    public static void main(String[] args) {
        List<person> list=List.of(new person("xiaoming"),
                                new person("xiaohong"),
                                new person("bill")
        );
        System.out.println(list.contains(new person("bill")));
        System.out.println(list.contains(new person("coach")));
        System.out.println(list.contains(new person(null)));
    }
}
