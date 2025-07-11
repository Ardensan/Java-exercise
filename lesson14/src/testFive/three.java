package testFive;

class CounterThree{
    public static final Object studentLock=new Object();
    public static final Object teacherLock=new Object();
    public static int studentCount=0;
    public static int teacherCount=0;
}
class addStudentThread extends Thread{
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized (CounterThree.studentLock){
                CounterThree.studentCount+=1;
            }
        }
    }
}
class decStudentThread extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            synchronized (CounterThree.studentLock){
                CounterThree.studentCount-=1;
            }
        }
    }
}
class addTeacherThread extends Thread{
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized (CounterThree.teacherLock){
                CounterThree.teacherCount+=1;
            }
        }
    }
}
class decTeacherThread extends Thread{
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized (CounterThree.teacherLock){
                CounterThree.teacherCount-=1;
            }
        }
    }
}
public class three {
    public static void main(String[] args) throws Exception {
        var ts=new Thread[]{
                new addStudentThread(),
                new decStudentThread(),
                new addTeacherThread(),
                new decTeacherThread()
        };
        for(var t:ts){
            t.start();
        }
        for(var t:ts){
            t.join();
        }
        System.out.println(CounterThree.studentCount);
        System.out.println(CounterThree.teacherCount);
    }
}
