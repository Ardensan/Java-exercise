import java.util.List;
public class ListToArray {
    public static void main(String[] args) {
        List<String> list=List.of("apple","bob","custem");
        Object[] array=list.toArray();
        for(Object s:array){
            System.out.print(s);
        }
        if(array instanceof Integer[]){System.out.println("是数组");}
        List<Integer> list1=List.of(11,22,33);
        Number[] array1=list1.toArray(new Number[list1.size()]);
        for(Number s:array1){System.out.println(s);}
    }
}
