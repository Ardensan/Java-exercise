
public class duogegouzao {
    private static class Person{
        private String name;
        private int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        Person(String name){
            this.name=name;
            this.age=18;
        }
        Person(){
            this.name="noname";
            this.age=18;
        }
    }


    public static void main(String[] args) {
        Person p1 = new Person("see you",12);
        System.out.println(p1.name + p1.age);
        Person p2 = new Person("alice");
        System.out.println(p2.name + p2.age);
        Person p3 = new Person();
        System.out.println(p3.name + p3.age);
    }
}


