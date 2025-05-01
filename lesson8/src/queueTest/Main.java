package queueTest;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        try{
            String s=q.remove();
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            String s=q.poll();
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
