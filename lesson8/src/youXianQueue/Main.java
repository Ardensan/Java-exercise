package youXianQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue();
        q.offer("perry");
        q.offer("cherry");
        q.offer("alice");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        //反向输出，从大到小
        Queue<Integer> e=new PriorityQueue<>(Comparator.reverseOrder());
        e.offer(1);
        e.offer(3);
        e.offer(10);
        System.out.println(e.poll());
        System.out.println(e.poll());
        System.out.println(e.poll());
    }
}
