public class shoubaohu {
    class Person{
        protected String name;
        protected int age;
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public int Getage(){
            return this.age;
        }
    }
    class Student extends Person{
        protected int score;
        public Student(String name,int age,int score){
            super(name,age);
            this.score=score;
        }
        public int Geta(){
            return super.Getage();
        }
    }
    class Teacher extends Person{
        protected int score;
        public Teacher(String name,int age,int score){
            super(name,age);
            this.score=score;
        }
        public int Geta(){
            return super.Getage();
        }
    }

    public static void main(String[] args){
        shoubaohu a = new shoubaohu();
        Student b = a.new Student("yeye",18,22);
        System.out.println(b.name + b.age + b.score);
        System.out.println(b.Geta());
        Teacher c=a.new Teacher("long",24,33);
        System.out.println(c.name + c.age + c.score);
        System.out.println(c.Geta());
    }
}
