/*我这里测试了继承和private私有变量的使用以及作用。
一般定义的内部变量要配合公共方法的使用
子类是没有办法直接访问内部变量的
*/
class Person{
    private String name;
    private int age;
    public void setPerson(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Student extends Person{
    private int score;
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return this.score;
    }
}
public class jicheng {
    public static void main(String[] args) {
        Person b = new Person();
        System.out.println(b instanceof Student);
        Student a = new Student();
        System.out.println(a instanceof Person);
        a.setPerson("aa",18);
        a.setScore(85);
        System.out.println(a.getName()+a.getAge()+a.getScore());
    }
}
