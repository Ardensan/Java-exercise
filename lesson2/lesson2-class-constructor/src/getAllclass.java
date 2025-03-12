import java.lang.reflect.Method;
public class getAllclass {
    public static void main(String[] args) {
        Class<?> objectClass=Object.class;
        Method[] methods=objectClass.getMethods();
        System.out.println(methods);//查看数组的对象，看到的不是对象的内容
        System.out.println("查看object暴露出来的公共类有几个"+methods.length);//查看这个数组有多少个元素
        System.out.println("查看具体的类名");
        for(Method method:methods){
            //只能获取公共类，内部类和私有类不能获取
            System.out.println(method.getName()+"返回类型"+method.getReturnType().getSimpleName());
        }
        Class<?> objectClass1=duotai.class;
        Method[] allMethods=objectClass1.getDeclaredMethods();
        System.out.println("查看duotai所有的类（包括私有,内部）"+allMethods.length);
        for(Method method:allMethods){
            System.out.println(method.getName() + "返回类型" + method.getReturnType());
        }
    }
}
