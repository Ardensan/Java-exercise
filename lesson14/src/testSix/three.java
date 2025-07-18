package testSix;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class TaskQueue{
    Queue<String> queue=new LinkedList<>();
    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notifyAll();
    }
    public synchronized String getTask() throws InterruptedException{
        while (queue.isEmpty()){
            this.wait();
        }
        return queue.remove();
    }
}
public class three {
    public static void main(String[] args) throws InterruptedException {
        var q=new TaskQueue();
        var ts=new ArrayList<Thread>();
        for(int i=0;i<5;i++){
            var t=new Thread(){
                public void run(){
                    while (true){
                        try{
                            String s=q.getTask();
                            System.out.println("Execute task"+s);
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        var add=new Thread(()->{
            for(int i=0;i<10;i++){
                String s=" t-"+Math.random();
                System.out.println("add task" +s);
                q.addTask(s);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){}
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
