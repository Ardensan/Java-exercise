package queueTest;
import java.util.LinkedList;
import java.util.Queue;
public class pollAndPeek {
    public static void main(String[] args) {
        Queue<String> s=new LinkedList<>();
        s.offer("apple");s.offer("banana");
        s.offer("cherry");
        System.out.println(s.poll());System.out.println(s.poll());
        System.out.println(s.poll());System.out.println(s.poll());
        Queue<String> q= new LinkedList<>();
        q.offer("alex");q.offer("bill");
        q.offer("christ");
        System.out.println(q.peek());System.out.println(q.peek());
    }
}
