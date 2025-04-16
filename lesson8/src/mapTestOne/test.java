package mapTestOne;
import java.util.*;
class Student{
    String name;
    int score;
    public Student(String name,int score){
        this.name=name;this.score=score;}
}
class Students{
    List<Student> list;
    Map<String,Integer> cache;
    public Students(List<Student> list){
        this.list=list;
        this.cache=new HashMap<>();
    }
    //根据名字去获取成绩
    int getScore(String name){
        Integer score=this.cache.get(name);
        if(score==null){
            score=finInList(name);
            this.cache.put(name,score);
        }
        return score==null?-1:score.intValue();
    }
    //这里的方法是根据名字去用for循环去遍历名字得出答案
    Integer finInList(String name){
        for(var ss:this.list){
            if(ss.name.equals(name)){
                return ss.score;
            }
        }
        return null;
    }
}
public class test {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
        list.add(new Student("Bob", 78));
        list.add(new Student("Alice", 85));
        list.add(new Student("Brush", 66));
        list.add(new Student("Newton", 99));
        Students holder=new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == 1 ? "测试成功!" : "测试失败!");
    }
}
