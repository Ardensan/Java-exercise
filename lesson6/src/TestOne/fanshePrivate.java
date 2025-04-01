package TestOne;
import java.lang.reflect.Method;
class person{
    String name;
    private void setName(String name){
        this.name=name;
    }
}
public class fanshePrivate {
    public static void main(String[] args) throws Exception {
        person p=new person();
        Method m=p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p,"bill");
        System.out.println(p.name);
    }
}
