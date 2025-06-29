package testTwo;
import java.beans.IntrospectionException;
class workerThread implements Runnable{
    private String name;
    private int workTime;
    public workerThread(String name,int workTime){
        this.name=name;
        this.workTime=workTime;
    }
    @Override
    public void run(){
        System.out.println(this.name + "开始工作");
        try{
            Thread.sleep(workTime*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name +"工作完成");
    }
}

public class one {
    private static void demoWithoutJoin(){
        Thread worker1=new Thread(new workerThread("one",3));
        Thread worker2=new Thread(new workerThread("two",1));
        worker1.start();
        worker2.start();
        System.out.println("主线程开始，等次线程吗？");
    }
    private static void demoWithJoin(){
        Thread worker1=new Thread(new workerThread("one",3));
        Thread worker2=new Thread(new workerThread("two",1));
        worker1.start();
        worker2.start();
        try{
            worker1.join();
            System.out.println("one is finish");
            worker2.join();
            System.out.println("two is finish");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程开始，等次线程吗？");
    }
    public static void main(String[] args) {
//        System.out.println("不用join");
//        demoWithoutJoin();
        System.out.println("用了join");
        demoWithJoin();
        System.out.println("完成了吗？");
    }
}
