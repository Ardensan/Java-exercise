package testTwo;

class TaskThread implements Runnable{
    private String taskName;
    private int duration;
    public TaskThread(String name,int duration){
        this.taskName=name;
        this.duration=duration;
    }
    @Override
    public void run(){
        System.out.println(this.taskName+"开始执行");
        try{Thread.sleep(duration);
        }catch (InterruptedException e){System.out.println(e);}
    }
}
public class two {
    private static void testBasicJoin(){
        Thread task=new Thread(new TaskThread("基础任务",1000));
        task.start();
        try{
            task.join();
            System.out.println("基础任务完成后我才能执行这句话");
        }catch (InterruptedException e){
        }
    }
    private static void testJoinWithTimeout(){
        Thread longTask =new Thread(new TaskThread("长时间任务",5000));
        longTask.start();
        try{
            longTask.join(3000);//最多等待3秒
            System.out.println(longTask.isAlive());
            if(longTask.isAlive()){System.out.println("主线程：等了3秒，任务还没完成，我不等了！");}
            else{System.out.println("主线程：任务在3秒内完成了");}
        }catch (InterruptedException e){}
    }
    private static void testSequentialExecution(){
        Thread task1=new Thread(new TaskThread("任务1",1000));
        Thread task2=new Thread(new TaskThread("任务2",2000));
        Thread task3=new Thread(new TaskThread("任务3",3000));
        try{
            task1.start();
            task1.join();
            task2.start();
            task2.join();
            task3.start();
            task3.join();
            System.out.println("所有任务按顺序完成了");
        }catch (InterruptedException e){
        }
    }
    public static void main(String[] args) {
        System.out.println("==1.无参数join()==");
        testBasicJoin();
        System.out.println("==2.带超时的join==");
        testJoinWithTimeout();
        System.out.println("==3.控制执行顺序==");
        //testSequentialExecution();
    }
}
