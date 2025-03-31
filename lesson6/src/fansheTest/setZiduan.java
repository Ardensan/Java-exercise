package fansheTest;
import java.lang.reflect.Field;
class person{
    private String name;
    private int age;
    public person(String name,int age){this.name=name;this.age=age;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
}
public class setZiduan {
    public static void main(String[] args) throws Exception {
        person p=new person("haha",23);
        System.out.println(p.getName()+p.getAge());
        Class c=p.getClass();
        Field f=c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"肏");
        Field a=c.getDeclaredField("age");
        a.setAccessible(true);
        a.set(p,12);
        System.out.println(p.getName()+p.getAge());
    }
}
