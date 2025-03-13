//尝试抽象类，抽象类一定要拥有一个抽象方法和若干个非抽象方法。注意抽象的父类里面的抽象方法，子类继承后一定要实现父类的抽象方法
public class chouxiang {
    abstract class Person {
        private String name;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }
        public abstract void eatSomething(String food);
    }
    class Student extends Person{
        String food;
        @Override
        public void eatSomething(String food) {
            this.food=food;
        }
        public String eatThing(){
            return this.food;
        }
    }
    public static void main(String[] args) {
        chouxiang a=new chouxiang();
        Student ap=a.new Student();
        ap.setName("jack");
        ap.eatSomething("apple");
        System.out.println(ap.getName()+" eat "+ap.eatThing());
    }
}
