package test1;
class Person{
    Adderss adderss=new Adderss();
}
class Adderss{
    String city;
    String street;
    String zipcode;
}
public class kongzhizhen {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.adderss.city.toLowerCase());
    }
}
