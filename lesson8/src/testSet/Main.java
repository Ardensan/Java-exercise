package testSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Message{
     final int sequence;final String text;
     public Message(int sequence,String text){
         this.sequence=sequence;
         this.text=text;
     }
}
public class Main {
    static List<Message> process(List<Message> received){
        Set<Integer> set=new TreeSet<>();
        List<Message> seen=new ArrayList<>();
        for(Message s:received){
            if(set.add(s.sequence)){
                seen.add(s);
            }
        }
        return seen;
    }
    public static void main(String[] args) {
        List<Message> received=List.of(
                new Message(1, "Hello!"), new Message(2, "发工资了吗？"),
                new Message(2, "发工资了吗？"), new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"), new Message(4, "Bye")
        );
        List<Message> displayMessage=process(received);
        for(Message m:displayMessage){
            System.out.println(m.text);
        }
    }
}
