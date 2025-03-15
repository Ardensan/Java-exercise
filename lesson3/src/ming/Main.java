//尝试用同一个包里的其他类
package ming;

public class Main {
    public static void main(String[] args) {
        Person a=new Person("ming",14);
        System.out.println(a.getName()+a.getAge());
    }
}
