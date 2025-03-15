public class jingtaifangfa {
    interface Person{
        public static final int MALE=1;
        //int MALE=1;
        //public static final int FEMALE=2;
        int FEMALE=2;
        //这public static final int和int，这两句话是等价的。就int a=1;编译器也会默认加上public static final
    }
    class animal{
        static int number;
        int age;
        public static void run(){
            System.out.println("run!");
        }
        public static void setNumber(int num){
            number=num;
        }
        public void setAge(int a){
            this.age=a;
        }
    }
    public static void main(String[] args) {
        animal.run();
        animal.setNumber(10);
        System.out.println(animal.number);
    }
}
