package youXianQueue;
import java.util.PriorityQueue;
import java.util.Queue;
class Patient implements Comparable<Patient>{
    String name;
    String condition;
    int priority;
    public Patient(String name,String condition,int priority){
        this.name=name;this.condition=condition;this.priority=priority;}
    @Override
    public int compareTo(Patient other){
        return Integer.compare(this.priority,other.priority);
    }
    @Override
    public String toString(){
        return String.format("患者:%s,病情:%s,优先级:%d",name,condition,priority);
    }
}
public class ziDingYi {
    public static void main(String[] args) {
        Queue<Patient> e=new PriorityQueue();
        e.offer(new Patient("alice","头痛",3));
        e.offer(new Patient("zeus","心脏病发",1));
        e.offer(new Patient("terry","骨折",2));
        e.offer(new Patient("bill","感冒",4));
        e.offer(new Patient("david","车祸",1));
        while(!e.isEmpty()){
            Patient p=e.poll();
            System.out.println(p);
        }
    }
}
