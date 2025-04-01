package TestTwo;
import java.lang.reflect.Method;
class person{
    public void hello(){
        System.out.println("person-hi");
    }
}
class student extends person{
    @Override
    public void hello(){
        System.out.println("student-hi");
    }
}
public class jicheng {
    public static void main(String[] args) throws Exception{
        Method h=person.class.getMethod("hello");
        h.invoke(new student());
        //相当于
        person s=new student();
        h.invoke(s);
    }
}
