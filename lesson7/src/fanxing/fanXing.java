package fanxing;
class Box<T>{
    private T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return this.item;
    }
}

class Utils{
    public static <E> E getFirstElement(E[] array,int index){
        if(array==null || array.length==0){
            return null;
        }
        return array[index];
    }
}
public class fanXing {
    public static void main(String[] args) {
        Box<String> a=new Box<String>();
        a.setItem("hello");
        System.out.println(a.getItem());
        Box<Integer> b=new Box<Integer>();
        b.setItem(123);
        System.out.println(b.getItem()+a.getItem());
        String[] names={"alice","bill","chalice"};
        System.out.println(Utils.getFirstElement(names,2));
    }
}
