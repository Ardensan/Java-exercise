//举个例子，理解注解的使用
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String description() default "注解用的接口方法";
}

class Calculator{
    @ImportantMethod(description = "计算两数值和")
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Method addMethod=calc.getClass().getMethod("add",int.class,int.class);
        if(addMethod.isAnnotationPresent(ImportantMethod.class)){
            ImportantMethod annotation=addMethod.getAnnotation(ImportantMethod.class);
            System.out.println("带注解的方法"+addMethod.getName());
            System.out.println("注解描述"+annotation.description());
            int addResult= calc.add(1, 2);
            System.out.println(addResult);
        }
        System.out.println("------");
        Method subMethod=calc.getClass().getMethod("sub",int.class,int.class);

        if(!subMethod.isAnnotationPresent(ImportantMethod.class)){
            System.out.println("普通方法"+subMethod.getName());
            System.out.println("没有注解描述"+subMethod);
            int subResult= calc.sub(8,3);
            System.out.println(subResult);
        }
    }
}