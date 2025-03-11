//test Override and Overload
public class duotai {
    class Person{
        public String run(){
            return "Person-run";
        }
    }
    class Student extends Person{
        @Override
        public String run() {
            return "Student-run";
        }
    }
    class Chongzai{
        int add(int a,int b){
            return a+b;
        }
        double add(double a,double b){
            return a+b;
        }
        int add(int a,int b,int c){
            return a+b+c;
        }
        double add(double a,double b,double c){
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        duotai a=new duotai();
        Person ap=a.new Person();
        System.out.println(ap.run());
        Student as=a.new Student();
        System.out.println(as.run());
        Chongzai ac=a.new Chongzai();
        System.out.println(ac.add(5,6)+" "+ac.add(5.5,7.8)+" "+ac.add(99,44,66)+" "+ac.add(9.5,4.1,61));
    }
}
