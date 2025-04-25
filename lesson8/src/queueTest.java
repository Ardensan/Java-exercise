import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class queueTest {
    public static void main(String[] args) {
        BlockingQueue<String> q=new ArrayBlockingQueue<>(2);
        try{
            q.add("apple");
            q.add("banana");
            q.add("cherry");
        }catch (Exception  e){System.out.println(e);}
        System.out.println(q);
        System.out.println("----");
        BlockingQueue<String> e=new ArrayBlockingQueue<>(2);
        try{
            e.offer("alex");e.offer("bill");
            e.offer("coach");
        }catch (Exception d){
            System.out.println(d);
        }
        System.out.println(e);
    }
}
