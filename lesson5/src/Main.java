import java.beans.*;
class Person{
    private String name;
    private int age;
    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
public class Main {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info=Introspector.getBeanInfo(Person.class);
        for(PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" "+pd.getReadMethod());
            System.out.println(" "+pd.getWriteMethod());
        }
    }
}

