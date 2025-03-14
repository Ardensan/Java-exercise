public class jiekou {
    interface Person{
        //只要是接口，那么默认修饰符是public abstract，所以方法不用写修饰符
        void eat();
    }
    interface male{
        void age();
    }
    class Teacher implements Person{
        @Override
        public void eat(){System.out.println("吃老师的东西");}
    }
    class Student implements Person,male{
        @Override
        public void eat(){System.out.println("吃学生的东西");}
        @Override
        public void age(){System.out.println("24岁的学生");}
    }
    public static void main(String[] args) {
        jiekou a=new jiekou();
        Person b = a.new Teacher();
        b.eat();
        Student c = a.new Student();
        c.eat();
        c.age();
    }
}
