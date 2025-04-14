import java.util.List;
public class ArrayToList {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        for(int s:array){System.out.print(s);}
        //这里定义一个对象数组
        Integer[] temp=new Integer[array.length];
        //当遇到基本类型数组转换为对象类型数组的时候，要用循环去进行装箱
        for(int i=0;i<array.length;i++){temp[i]=array[i];}
        //这里定义个列表数组
        List<Integer> list=List.of(temp);
        System.out.println(list.toString());
    }
}
