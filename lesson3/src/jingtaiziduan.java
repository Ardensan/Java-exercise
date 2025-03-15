public class jingtaiziduan {
    class animal{
        String name;
        int age;
        static int number;
        public animal(String name, int age) {
            this.name = name;
            this.age=age;
        }
    }
    public static void main(String[] args) {
        jingtaiziduan a=new jingtaiziduan();
        animal dog=a.new animal("dog",3);
        dog.number=15;
        animal cat=a.new animal("cat",2);
        System.out.println(dog.number + "name:"+ dog.name);
        System.out.println(cat.number +"name:"+ cat.name);
        cat.number=9;
        System.out.println(dog.number + "name:"+ dog.name);
        System.out.println(cat.number +"name:"+ cat.name);
        animal.number=24;
        System.out.println(dog.number + "name:"+ dog.name);
        System.out.println(cat.number +"name:"+ cat.name);
    }
}
