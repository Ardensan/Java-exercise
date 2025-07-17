package testSix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class TaskQueueTwo{
    private final ReentrantLock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    private Queue<String> queue=new LinkedList<>();
    public void addTask(String s){
        lock.lock();
        try{
            queue.add(s);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public String getTask(){
        lock.lock();
        try{
            while(queue.isEmpty()){
                condition.await();
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }
        return queue.remove();
    }
}

public class five {
    public static void main(String[] args) throws Exception{
        var q=new TaskQueueTwo();
        var ts=new LinkedList<Thread>();
        for(int i=0;i<5;i++){
            var t=new Thread(){
                public void run(){
                    while (true){
                        try{
                            String s=q.getTask();
                            System.out.println("队列的数值有"+s);
                        }catch (Exception e){
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        var add=new Thread(()->{
            for(int i=0;i<10;i++) {
                String s = "随机数:" + Math.random();
                System.out.println("add Task" + s);
                q.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        for(var t:ts){
            t.interrupt();
        }
    }
}
