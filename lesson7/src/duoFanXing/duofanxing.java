package duoFanXing;
class fanxing<T,K>{
    private T first;
    private K last;
    public fanxing(T first, K last) {
        this.first=first;
        this.last=last;
    }
    public T getFirst() {return this.first;}
    public K getLast(){return this.last;}
}
public class duofanxing {
    public static void main(String[] args) {
        fanxing<String,Integer> aa=new fanxing<>("haha",23);
        System.out.println(aa.getFirst()+aa.getLast());
    }
}
