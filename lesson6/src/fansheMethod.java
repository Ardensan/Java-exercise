import java.lang.reflect.Method;
public class fansheMethod {
    public static void main(String[] args) throws Exception{
        String s="hello world";
        System.out.println(s.substring(5));
        Method m=String.class.getMethod("substring", int.class);
        String r=m.invoke(s,6).toString();
        System.out.println(r);
    }
}
