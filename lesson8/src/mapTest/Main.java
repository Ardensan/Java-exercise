package mapTest;

import java.util.HashMap;
import java.util.Map;

class Student{
    String name;
    int score;
    int height;
    public Student(String name, int score,int height) {
        this.name=name;this.score=score;this.height=height;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s=new Student("bill",79,170);
        Map<String,Student> map =new HashMap<>();
        map.put("bill",s);
        Student target=map.get("bill");
        System.out.println(map.get("bill"));
        System.out.println(target==s);
        System.out.println(target.score);
        System.out.println(target.height);
        System.out.println(map.get("bil"));
        System.out.println(map.containsKey("bil"));
        System.out.println(map.containsValue(s));
    }
}
