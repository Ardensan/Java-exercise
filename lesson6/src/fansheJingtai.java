import java.lang.reflect.Method;
public class fansheJingtai {
    public static void main(String[] args) throws Exception{
        Method m=Integer.class.getMethod("parseInt", String.class);
        Integer n=(Integer) m.invoke(null,"233");
        System.out.println(n);
    }
}
