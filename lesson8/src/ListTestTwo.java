import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ListTestTwo {
    public static void main(String[] args) {
        int start=2;
        int end=20;
        List<Integer> list=new ArrayList<>();
        for(int i=start;i<=end;i++){
            list.add(i);
        }
        int removed=list.remove((int)(Math.random()*list.size()));
        System.out.println(removed);
        //Collections.shuffle这个方法可以打乱数组对象的元素
        Collections.shuffle(list);
        System.out.println(list.toString());
        int found=foundMissed(start,end,list);
        System.out.println(found);
    }
    static int foundMissed(int start,int end,List<Integer> list){
        for(int i=start;i<=end;i++){
            //contains找出数组对象的某个值，找到则返回ture.
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;
    }

    static int foundMiss(int start,int end,List<Integer> list){
        List<Integer> listTemp=new ArrayList<>();
        for(int i=start;i<=end;i++){listTemp.add(i);}
        for(int i=0;i<listTemp.size();i++){
            if(listTemp.get(i)!=list.get(i)){
                return listTemp.get(i);
            }
        }
        return 0;
    }
}
