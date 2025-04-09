import java.util.Iterator;
import java.util.List;
public class ListBianli {
    public static void main(String[] args) {
        List<Integer> a=List.of(1,2,3,4,5);
        //这种方式最慢，最不推荐
        for(int i=0;i<a.size();i++){
            int b=a.get(i);
            System.out.println(b);
        }
        //使用迭代器去执行
        for(Iterator<Integer> it =a.iterator();it.hasNext(); ){
            Integer s=it.next();
            System.out.print(s);
        }
        //而语法糖foreach可以不用写这么多，但是执行速度也是相似的
        for(int b:a){
            System.out.print(b);
        }
    }
}
