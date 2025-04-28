package dequeTest;
import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
        deque.offerLast("a");
        deque.offerLast("b");
        deque.offerFirst("c");
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
    }
}
