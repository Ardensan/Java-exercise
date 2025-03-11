//java的向上转换和向下转换，向下转换不需要显式转换
public class shilihua {
    class Person{
        public String run(){
            return "run-person";
        }
    }
    class Student extends Person{
        @Override
        public String run(){
            return "run-student";
        }
    }
    public static void main(String[] args) {
        shilihua a=new shilihua();
        Person ad=a.new Person();
        System.out.println(ad.run());
        Person ae=a.new Student();
        System.out.println(ae.run());
        Student ac=(Student)ae;//显式转换
        System.out.println(ac.run());
    }
}
