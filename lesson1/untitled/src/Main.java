// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
class Person {
    private String[] name;
    public void setNames(String... name){this.name=name;}
    public String[] getNames(){return this.name;}
}
public class Main {
    public static void main(String[] args) {
        Person a=new Person();
        String[] b= new String[]{"jiji","tuju1","dqw"};
        a.setNames(b);
        System.out.println(Arrays.toString(a.getNames()));
        b[0]="667";
        System.out.println(Arrays.toString(a.getNames()));
    }
}