package EqualsFuntion;
import java.util.List;
import java.util.Objects;
class Student{
    String firstName;
    String lastName;
    int age;
    public Student(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){return true;}
        if(!(o instanceof Student)){return false;}
        Student s=(Student)o;
        return age==s.age&& Objects.equals(firstName,s.firstName)&&Objects.equals(lastName,s.lastName);
    }
}
public class TestOne {
    public static void main(String[] args) {
        List<Student> list=List.of(
                new Student("xiao","ming",18),
                new Student("lucy","simi",15),
                new Student("funny","bill",17)
        );
        List<Student> list1=list;
        Boolean exist=list.equals(list1);
        System.out.println(exist?"15行执行成功":"失败");
        String name="在这里传入一个与list类不相干的类，便会执行16行的代码";
        Boolean exist1=list.contains(name);
        System.out.println(exist1?"成功":"失败");
        boolean exist2 = list.contains(new Student("funny","bill",17));
        System.out.println(exist2?"成功":"失败");
    }
}
