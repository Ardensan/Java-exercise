package dieDaiQi;
import java.util.*;
class ReverseList<T> implements Iterable<T>{
    private List<T> list=new ArrayList<>();
    public void add(T t){
        list.add(t);}
    class ReverIterator implements Iterator<T>{
        int index;
        ReverIterator(int index){
            this.index=index;
        }
        @Override
        public boolean hasNext(){
            return index>0;
        }
        @Override
        public T next(){
            index--;
            return ReverseList.this.list.get(index);
        }
    }
    @Override
    public Iterator<T> iterator(){
        return new ReverIterator(list.size());
    }
}
public class Main {
    public static void main(String[] args) {
        ReverseList<String> rlist=new ReverseList<>();
        rlist.add("apple");
        rlist.add("bill");
        rlist.add("cherry");
        for(String s:rlist){
            System.out.println(s);
        }
    }
}
