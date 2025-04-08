import java.util.ArrayList;
import java.util.List;
public class ShuzuAndList {
    public static void main(String[] args) {
        //数组在定义的时候就要给长度值
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=i;
            System.out.print(a[i]);
        }
        //列表是这么定义的
        List<Integer> b=new ArrayList<>();
        for (int i=10;i<20;i++){
            b.add(i);
        }
        System.out.println(b.toString());
        System.out.println(b.size());
    }
}
