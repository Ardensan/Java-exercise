package fansheConstructor;
import java.lang.reflect.Constructor;
class person{
    public person(){
        System.out.println("hello-person");
    }
}
class student {
    public student(String name){
        System.out.println("hello"+name);
    }
}
public class testOne {
    public static void main(String[] args) throws Exception {
        //person p=new person();
        person p=person.class.newInstance();
        Constructor cons1=student.class.getConstructor(String.class);
        student s = (student) cons1.newInstance("haha");
    }
}
