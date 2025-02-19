public class duocengjicheng {
    class Person{
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    }
    class Student extends Person{
        private int score;
        public Student(String name,int age,int score){
            super(name,age);
            this.score=score;
        }
        public int getScore() {
            return this.score;
        }
    }
    class PrimaryStudent extends Student{
        private int grade;
        public PrimaryStudent(String name, int age, int score, int grade) {
            super(name,age,score);
            this.grade=grade;
        }
        public int getGrade() {
            return this.grade;
        }
    }
    public static void main(String[] args) {
        duocengjicheng a = new duocengjicheng();
        Person pa=a.new Person("Xiao jun", 18);
        Student pb= a.new Student("Xiao hong", 4, 19);
        PrimaryStudent ps = a.new PrimaryStudent("Xiao Ming", 8, 99, 5);
        System.out.println(pa.getName() + ", " + pa.getAge());
        System.out.println(pb.getName() + ", " + pb.getAge() + ", " + pb.getScore());
        System.out.println(ps.getName() + ", " + ps.getAge() + ", " + ps.getScore() + ", " + ps.getGrade());
    }
}
