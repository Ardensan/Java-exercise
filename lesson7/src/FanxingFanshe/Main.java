package FanxingFanshe;
import java.lang.reflect.Constructor;
//java的部分反射api定义的也是泛型
public class Main {
    public static void main(String[] args) throws Exception {
        Class<Integer> clazz=Integer.class;
        Constructor<Integer> cons=clazz.getConstructor(int.class);
        Integer i=cons.newInstance(123);
        System.out.println(i);
    }
}
