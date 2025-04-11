package EqualsFuntion;
class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class TestOne {
    public static void main(String[] args) {
        Student a=new Student("de");
        System.out.println(a.getName());
    }
}
