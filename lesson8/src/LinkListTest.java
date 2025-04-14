import java.util.LinkedList;
public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<>();
        a.add("苹果");
        a.add("橡胶");
        a.add("橙子");
        a.addFirst("茄子");
        a.addLast("蔬菜");
        System.out.println(a.toString());
        //获取第一个元素
        System.out.println(a.getFirst());
        //删除第一个元素
        System.out.println(a.removeFirst());
        System.out.println(a.toString());
        System.out.println(a.removeLast());
        System.out.println(a.toString());
    }
}
