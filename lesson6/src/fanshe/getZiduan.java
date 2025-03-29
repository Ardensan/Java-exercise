package fanshe;
import java.lang.reflect.Field;
class person{
    private String name;
    public person(String name){
        this.name=name;
    }
}
public class getZiduan {
    public static void main(String[] args) throws Exception {
        Object p =new person("xiongdi");
        Class c=p.getClass();
        Field f=c.getDeclaredField("name");
        //加了这句话就不会报IllegalAccessException这个错
        f.setAccessible(true);
        Object value=f.get(p);
        System.out.println(value);
    }
}
