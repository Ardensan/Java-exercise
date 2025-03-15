//利用静态成员和静态方法去记录实例化几次
public class personCount {
    class Person{
        String name;
        int age;
        private static int count=0;
        static int getCount(){
            return count;
        }
        public Person(String name,int age){
            this.name=name;
            this.age=age;
            count++;
        }
    }
    public static void main(String[] args) {
        personCount.Person a=new personCount().new Person("jack",12);
        personCount.Person b=new personCount().new Person("lucy",11);
        personCount.Person c=new personCount().new Person("Aden",11);
        System.out.println(Person.getCount());
        System.out.println(Person.count);
    }
}
